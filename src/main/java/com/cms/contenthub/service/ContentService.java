package com.cms.contenthub.service;

import com.cms.contenthub.entity.Content;
import com.cms.contenthub.repository.ContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    private final ContentRepository repository;

    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public Content createContent(Content content) {
        return repository.save(content);
    }

    public List<Content> getPublishedContents() {
        return repository.findByStatus("PUBLISHED");
    }

    public Content getContentById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
