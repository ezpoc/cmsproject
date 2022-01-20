package com.cms.cis.controllers;

import com.cms.cis.service.FragmentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
@Api(tags = "Fragment")
public class FragmentController {

    @Autowired
    private FragmentService fragmentService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws IOException {
        return new ResponseEntity<>(fragmentService.addFile(file), HttpStatus.OK);
    }
}
