package com.alexc.springbootsearchrestapi.service;

import com.alexc.springbootsearchrestapi.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
}
