package com.cms.cis.controllers;

import com.cms.cis.entity.NameSpaces;
import com.cms.cis.service.ContentPublicationService;
import com.cms.cis.service.NameSpaceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
@Api(tags = "NameSpace")
public class NameSpaceController {

    @Autowired
    private NameSpaceService nameSpaceService;

    @Autowired
    private ContentPublicationService contentPublicationService;

    @PostMapping("/addNameSpace")
    public ResponseEntity<?> addNameSpace(@RequestParam("publicationId") String publicationId,@RequestBody NameSpaces nameSpace) throws IOException {
        nameSpace.setCreatedAt(LocalDateTime.now());
        nameSpace.setLastModifiedAt(LocalDateTime.now());
        NameSpaces savedNameSpace = nameSpaceService.addNameSpace(nameSpace);
        contentPublicationService.updateNameSpaceRef(publicationId,savedNameSpace);
        return new ResponseEntity<>(savedNameSpace.getId(), HttpStatus.OK);
    }
}
