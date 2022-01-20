package com.cms.cis.controllers;

import com.cms.cis.entity.ContentPublication;
import com.cms.cis.service.ContentPublicationService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Api(tags = "Publication")
@AllArgsConstructor
public class ContentPublicationController {

    private final ContentPublicationService publicationService;

    @GetMapping("/publications")
    public List<ContentPublication> fetchAllPublications() {
        return publicationService.getAllPublications();
    }

}
