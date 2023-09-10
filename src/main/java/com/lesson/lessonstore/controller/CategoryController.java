package com.lesson.lessonstore.controller;


import com.lesson.lessonstore.entity.Category;
import com.lesson.lessonstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    public CategoryService categoryService;


    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategory() {
        return categoryService.getAll();
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }
}
