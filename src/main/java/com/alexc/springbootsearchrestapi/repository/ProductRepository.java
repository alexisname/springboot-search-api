package com.alexc.springbootsearchrestapi.repository;

import com.alexc.springbootsearchrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
