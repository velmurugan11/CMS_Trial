package com.cms.contenthub.controller;

import com.cms.contenthub.entity.Content;
import com.cms.contenthub.service.ContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms/contents")
public class ContentController {

    private final ContentService service;

    public ContentController(ContentService service) {
        this.service = service;
    }

    @PostMapping
    public Content create(@RequestBody Content content) {
        return service.createContent(content);
    }

    @GetMapping("/published")
    public List<Content> getPublished() {
        return service.getPublishedContents();
    }

    @GetMapping("/{id}")
    public Content getById(@PathVariable Long id) {
        return service.getContentById(id);
    }
}
