package com.ecommerce.shopmateecom.service.impl;

import com.ecommerce.shopmateecom.converter.CategoryConverter;
import com.ecommerce.shopmateecom.dto.category.CategoryResponse;
import com.ecommerce.shopmateecom.entity.Category;
import com.ecommerce.shopmateecom.repository.CategoryRepository;
import com.ecommerce.shopmateecom.service.CategoryService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Page<CategoryResponse> getAllCategories(Pageable pageable) {
        Page<Category> categories = categoryRepository.findAll(pageable);
        if (categories.isEmpty()) {
            throw new RuntimeException("Category not found");
        }

        return categories.map(category -> {
            CategoryResponse categoryResponse = CategoryConverter.toCategoryResponse(category);
            return categoryResponse;
        });
    }

    @Override
    public Integer countCategory() {
        return Math.toIntExact(categoryRepository.count());
    }
}
