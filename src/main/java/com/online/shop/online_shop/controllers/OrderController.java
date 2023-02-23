package com.online.shop.online_shop.controllers;


import com.online.shop.online_shop.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@Controller
public class OrderController {
    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping ("product/{name}")
    public String saveOrder(@PathVariable String name){
        orderService.save(name);

        System.out.println("Name value " + name);
        return "orders/index";
    }


    @RequestMapping({"/orders","orders","orders/list","/orderList"})
    public String listOrders(Model model){

        model.addAttribute("orders",orderService.findAll());

        return "orders/orderList";
    }
}

