package com.cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmetic.domain.Link;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {
    List<Link> findAllByItemId(Long itemId);
}