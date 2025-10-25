package com.shop4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop4.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}