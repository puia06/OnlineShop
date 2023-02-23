package com.online.shop.online_shop.services;

import com.online.shop.online_shop.model.Order;
import com.online.shop.online_shop.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(String prodName) {
        Order order=new Order();
        order.setProductName(prodName);
        return orderRepository.save(order);
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
