package com.online.shop.online_shop.controllers;


import com.online.shop.online_shop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping({"/products","products/index","products/index/html","/products.html"})
    public String listProducts(Model model){

        model.addAttribute("products",productService.findAll());

        return "products/index";
    }


}
