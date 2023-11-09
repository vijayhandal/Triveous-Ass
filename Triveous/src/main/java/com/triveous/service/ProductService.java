package com.triveous.service;

import com.triveous.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Long productId);

}
