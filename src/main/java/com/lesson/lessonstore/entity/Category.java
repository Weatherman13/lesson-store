package com.lesson.lessonstore.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class Category {
    private UUID id;
    private List<String> productTypes;
    private Timestamp createdBy;
}
