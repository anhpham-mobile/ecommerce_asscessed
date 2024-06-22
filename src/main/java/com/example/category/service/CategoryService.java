package com.example.category.service;

import com.example.category.model.Category;
import com.example.category.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(String id) {
        return this.categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return (Category)this.categoryRepository.save(category);
    }

    public Category updateCategory(String id, Category category) {
        Optional<Category> existingCategory = this.categoryRepository.findById(id);
        if (existingCategory.isPresent()) {
            Category updatedCategory = (Category)existingCategory.get();
            updatedCategory.setName(category.getName());
            updatedCategory.setParentID(category.getParentID());
            return (Category)this.categoryRepository.save(updatedCategory);
        } else {
            return null;
        }
    }

    public List<Category> getCategoriesByParentId(String parentId) {
        return (List)this.categoryRepository.findAll().stream().filter((category) -> {
            return parentId.equals(category.getParentID());
        }).collect(Collectors.toList());
    }

    public void deleteCategory(String id) {
        this.categoryRepository.deleteById(id);
    }

    public CategoryService(final CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
