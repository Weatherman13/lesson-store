package com.lesson.lessonstore.repository;


import com.lesson.lessonstore.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    private static List<Category> categories = new ArrayList<>();

    static {
//        Category c1 = Category.builder()
//                .id(UUID.randomUUID())
//                .build();
//        Category c2 = Category.builder()
//                .id(UUID.randomUUID())
//                .build();
//        Category c3 = Category.builder()
//                .id(UUID.randomUUID())
//                .build();
//        categories.add(c1);
//        categories.add(c2);
//        categories.add(c3);
    }


    public List<Category> getAll() {
        return categories;
    }

    public Category createCategory(Category category) {
        categories.add(category);
        return category;
    }
}
