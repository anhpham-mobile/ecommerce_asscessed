package com.example.category.controller;
import com.example.category.model.Category;
import com.example.category.service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/categories"})
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return this.categoryService.getAllCategories();
    }

    @GetMapping({"/{id}"})
    public Optional<Category> getCategoryById(@PathVariable String id) {
        return this.categoryService.getCategoryById(id);
    }

    @GetMapping({"/level/{parentId}"})
    public List<Category> getCategoriesByParentId(@PathVariable String parentId) {
        return this.categoryService.getCategoriesByParentId(parentId);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return this.categoryService.createCategory(category);
    }

    @PutMapping({"/{id}"})
    public Category updateCategory(@PathVariable String id, @RequestBody Category category) {
        return this.categoryService.updateCategory(id, category);
    }

    @DeleteMapping({"/{id}"})
    public void deleteCategory(@PathVariable String id) {
        this.categoryService.deleteCategory(id);
    }

    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
