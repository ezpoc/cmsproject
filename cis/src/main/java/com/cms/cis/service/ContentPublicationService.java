package com.cms.cis.service;

import com.cms.cis.entity.ContentPublication;
import com.cms.cis.entity.NameSpaces;
import com.cms.cis.repository.ContentPublicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ContentPublicationService {

    private final ContentPublicationRepository publicationRepository;

    public List<ContentPublication> getAllPublications(){
        return publicationRepository.findAll();
    }

    public ContentPublication insertPublication(ContentPublication publication){
        return publicationRepository.insert(publication);
    }

    public void updateNameSpaceRef(String publicationId, NameSpaces nameSpace){
        Optional<ContentPublication> publication = publicationRepository.findById(publicationId);
        if(publication.isPresent() && nameSpace != null){
            ContentPublication updatedPublication = publication.get();
            List<NameSpaces> nameSpacesList = updatedPublication.getNameSpaces();
            nameSpacesList.add(nameSpace);
            updatedPublication.setNameSpaces(nameSpacesList);
            publicationRepository.save(updatedPublication);
        }
    }
}
