package com.lesson.lessonstore.service;


import com.lesson.lessonstore.entity.Category;
import com.lesson.lessonstore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAll() {
        return repository.getAll();
    }

    public Category createCategory(Category category) {
        return repository.createCategory(category);
    }
}
