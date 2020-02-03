package com.codeinvestigator.mongomysql.mongo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitAlienData {
    private final AlienRepository alienRepository;
    @PostConstruct
    void createData(){
        alienRepository.deleteAll();
        alienRepository.save(new Alien(null, "Mike", 2.0d, 113.3d));
        alienRepository.save(new Alien(null, "Ole", 1.3d, 113.3d));
        alienRepository.save(new Alien(null, "Søren", 1.5d, 113.3d));
        alienRepository.save(new Alien(null, "Jens", 1.0d, 113.3d));
    }

}
