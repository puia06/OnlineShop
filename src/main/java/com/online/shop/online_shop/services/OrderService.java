package com.online.shop.online_shop.services;

import com.online.shop.online_shop.model.Order;

import java.util.Set;


public interface OrderService {
    Order save(String productName);
    Set<Order> findAll();

    Order findById(Long id);


}
