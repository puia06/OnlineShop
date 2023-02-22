package com.online.shop.online_shop.services;

import com.online.shop.online_shop.model.Product;

import java.util.Set;

public interface ProductService {
    Set<Product> findAll();
    Product save(Product object);

}
