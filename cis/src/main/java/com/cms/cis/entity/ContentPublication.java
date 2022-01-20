package com.cms.cis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class ContentPublication {

    @Id
    private String id;

    private String name;

    private String description;

    private String type;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private String createdBy;

    private String lastModifiedBy;

    @DBRef
    private List<NameSpaces> nameSpaces = new ArrayList<>();

    public ContentPublication(String name, String description, String type,
                              LocalDateTime createdAt, LocalDateTime lastModifiedAt,
                              String createdBy, String lastModifiedBy) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }
}
