package com.ecommerce.shopmateecom.repository;

import com.ecommerce.shopmateecom.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer> {
}
