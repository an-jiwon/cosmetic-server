package com.cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmetic.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findById (Long categoryId);
}
