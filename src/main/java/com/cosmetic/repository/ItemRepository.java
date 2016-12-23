package com.cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmetic.domain.Item;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findAllByCategoryId(Long categoryId);
}
