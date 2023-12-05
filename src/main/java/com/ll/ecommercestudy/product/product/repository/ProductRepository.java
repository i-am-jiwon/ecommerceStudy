package com.ll.ecommercestudy.product.product.repository;

import com.ll.ecommercestudy.product.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
