package com.cms.cis.controllers;

import com.cms.cis.entity.ContentPublication;
import com.cms.cis.service.ContentPublicationService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @PostMapping("/addPublication")
    public ResponseEntity<?> addPublication(@RequestBody ContentPublication publication){
        publication.setCreatedAt(LocalDateTime.now());
        publication.setLastModifiedAt(LocalDateTime.now());
        ContentPublication savedPublication = publicationService.insertPublication(publication);
        return new ResponseEntity<>(savedPublication.getId(), HttpStatus.OK);
    }
}
