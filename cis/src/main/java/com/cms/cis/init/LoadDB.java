package com.cms.cis.init;

import com.cms.cis.entity.ContentPublication;
import com.cms.cis.repository.ContentPublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class LoadDB implements CommandLineRunner {

    @Autowired
    private ContentPublicationRepository publicationRepository;

    @Override
    public void run(String... args) throws Exception {
        List<ContentPublication> publications = publicationRepository.findByName("Test Publication 2");
        if(publications!=null && publications.size() == 0) {
            ContentPublication publication = new ContentPublication(
                    "Test Publication 2",
                    "Description of the test data publication goes here",
                    "Type 1",
                    LocalDateTime.now(),
                    LocalDateTime.now(),
                    "Admin",
                    "Admin"
            );

            publicationRepository.save(publication);
        }
    }
}
