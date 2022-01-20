package com.cms.cis.controllers;

import com.cms.cis.entity.ContentPublication;
import com.cms.cis.service.ContentPublicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/publications")
@AllArgsConstructor

public class ContentPublicationController {

    private final ContentPublicationService publicationService;

    @GetMapping
    public List<ContentPublication> fetchAllPublications() {
        return publicationService.getAllPublications();
    }

}
