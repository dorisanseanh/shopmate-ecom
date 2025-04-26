package com.ecommerce.shopmateecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private double price;

    private Integer quantity;

    private String description;

    private double discount;

}
