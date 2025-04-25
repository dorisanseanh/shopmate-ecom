package com.ecommerce.shopmateecom.service;

import com.ecommerce.shopmateecom.dto.category.CategoryRequest;
import com.ecommerce.shopmateecom.dto.category.CategoryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CategoryService {
    Page<CategoryResponse> getAllCategories(Pageable pageable);
    Integer countCategory();
}
