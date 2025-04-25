package com.ecommerce.shopmateecom.converter;

import com.ecommerce.shopmateecom.dto.category.CategoryRequest;
import com.ecommerce.shopmateecom.dto.category.CategoryResponse;
import com.ecommerce.shopmateecom.entity.Category;

public class CategoryConverter {
    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .build();
    }

    public static Category toCategory(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setCategoryName(categoryRequest.getCategoryName());
        return category;
    }
}
