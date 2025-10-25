package com.shop4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop4.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}