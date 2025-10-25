package com.shop4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop4.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
