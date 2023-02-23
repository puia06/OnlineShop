package com.online.shop.online_shop.controllers;

import com.online.shop.online_shop.model.Order;
import com.online.shop.online_shop.services.OrderService;
import com.online.shop.online_shop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@Controller
public class OrderController {
    private final OrderService orderService;
    private final ProductService productService;

    public OrderController(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @GetMapping ("product/{name}")
    public String saveOrder(@PathVariable String name){
        Order order=new Order();
        order.setProductName(name);
        orderService.save(order);

        System.out.println("Name value " + name);
        return "orders/index";
    }

    @RequestMapping({"/orders","/orders/list"})
    public String listOrders(Model model){

        model.addAttribute("orders",orderService.findAll());

        return "orders/orderList";
    }
}

