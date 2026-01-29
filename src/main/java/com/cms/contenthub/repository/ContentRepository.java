package com.cms.contenthub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.contenthub.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
    List<Content> findByStatus(String status);
}
