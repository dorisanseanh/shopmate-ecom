package com.ecommerce.shopmateecom.dto.category;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryRequest {
    @NotBlank(message = "Category is required")
    private String categoryName;
}
