package com.online.shop.online_shop.services;

import com.online.shop.online_shop.model.Order;
import com.online.shop.online_shop.repositories.OrderRepository;
import com.online.shop.online_shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class OrderImpl implements OrderService{
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public OrderImpl(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Order save(Order object) {
        return orderRepository.save(object);
    }


    @Override
    public Set<Order> findAll() {
        Set<Order> orders=new HashSet<>();
        orderRepository.findAll().forEach(order -> orders.add(order));
        return orders;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
