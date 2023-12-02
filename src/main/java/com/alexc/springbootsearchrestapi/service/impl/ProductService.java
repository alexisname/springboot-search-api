package com.alexc.springbootsearchrestapi.service.impl;

import com.alexc.springbootsearchrestapi.model.Product;
import com.alexc.springbootsearchrestapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements com.alexc.springbootsearchrestapi.service.ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }
}
