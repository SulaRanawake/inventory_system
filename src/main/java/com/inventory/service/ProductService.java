package com.inventory.service;

import com.inventory.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product, String performedBy);

    Product updateProduct(Long id, Product product, String performedBy);

    void deleteProduct(Long id, String performedBy);

    Optional<Product> getProductById(Long id);

    List<Product> getAllProducts();
}
