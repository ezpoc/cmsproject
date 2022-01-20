package com.cms.cis.repository;

import com.cms.cis.entity.ContentPublication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContentPublicationRepository extends MongoRepository<ContentPublication, String> {

    List<ContentPublication> findByName(String name);
}
