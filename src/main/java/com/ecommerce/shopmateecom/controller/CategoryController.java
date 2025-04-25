package com.ecommerce.shopmateecom.controller;

import com.ecommerce.shopmateecom.dto.category.CategoryResponse;
import com.ecommerce.shopmateecom.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<Page<CategoryResponse>> getAllCategories(@RequestParam("page") Optional<Integer> page,
                                                                   @RequestParam("size") Optional<Integer> size) {
        Integer count = categoryService.countCategory();
        Pageable pageable = PageRequest.of(page.orElse(0), size.orElse(count));
        return ResponseEntity.ok(categoryService.getAllCategories(pageable));
    }
}
