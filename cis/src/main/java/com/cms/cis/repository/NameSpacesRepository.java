package com.cms.cis.repository;

import com.cms.cis.entity.NameSpaces;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NameSpacesRepository extends MongoRepository<NameSpaces,String> {
}
