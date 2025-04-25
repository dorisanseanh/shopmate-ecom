package com.ecommerce.shopmateecom.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product")
    private int productId;

    @Column(name = "name")
    private String productName;
}
