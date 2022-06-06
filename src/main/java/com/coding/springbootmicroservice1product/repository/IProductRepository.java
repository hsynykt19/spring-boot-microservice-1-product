package com.coding.springbootmicroservice1product.repository;

import com.coding.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
