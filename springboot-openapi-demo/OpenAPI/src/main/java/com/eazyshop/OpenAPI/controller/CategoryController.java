package com.eazyshop.OpenAPI.controller;

import com.eazyshop.OpenAPI.model.Category;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Tag(name = "Category")
    @Operation(summary = "Get category details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Category",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Category.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Category not found",
                    content = @Content) })
    @GetMapping("/categories")
    public List<Category> getCategories(@RequestParam(required = false) int categoryId) {
        List<Category> categories = new ArrayList<>();
        return categories;
    }

    @Tag(name = "Category")
    @Operation(summary = "Get category details using path param")
    @GetMapping("/categories/{categoryId}")
    public Category getCategoryDetails(@PathVariable int categoryId) {
        Category category = new Category();
        return category;
    }

}
