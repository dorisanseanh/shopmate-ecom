package com.ecommerce.shopmateecom.dto.category;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryResponse {
    private Integer categoryId;
    private String categoryName;
}
