package com.cms.cis.service;

import com.cms.cis.entity.NameSpaces;
import com.cms.cis.repository.NameSpacesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NameSpaceService {

    private final NameSpacesRepository nameSpacesRepository;

    public NameSpaces addNameSpace(NameSpaces namespace){
        NameSpaces savedNameSpace = nameSpacesRepository.save(namespace);
        return savedNameSpace;
    }
}
