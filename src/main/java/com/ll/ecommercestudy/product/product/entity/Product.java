package com.ll.ecommercestudy.product.product.entity;

import com.ll.ecommercestudy.seller.seller.entity.Seller;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200)
    private String productName;
    private Integer price;
    private Integer remaining;
    @ManyToOne
    private Seller seller;
    @ManyToOne
    private Customer customer;
}
