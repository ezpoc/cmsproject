package com.cms.cis.repository;

import com.cms.cis.entity.ContentPublication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContentPublicationRepository extends MongoRepository<ContentPublication, String> {
}
