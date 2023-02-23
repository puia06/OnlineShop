package com.online.shop.online_shop.services;

import com.online.shop.online_shop.model.Product;
import com.online.shop.online_shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ProductImpl implements ProductService {
    private final ProductRepository productRepository;


    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> findAll() {
        Set<Product> products=new HashSet<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }

    @Override
    public Product save(Product object) {
        return productRepository.save(object);
    }
}
