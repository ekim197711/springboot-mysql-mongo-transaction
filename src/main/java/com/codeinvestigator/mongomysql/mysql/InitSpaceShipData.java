package com.codeinvestigator.mongomysql.mysql;

import com.codeinvestigator.mongomysql.mongo.Alien;
import com.codeinvestigator.mongomysql.mongo.AlienRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitSpaceShipData {
    private final SpaceShipRepository spaceShipRepository;
    @PostConstruct
    void createData(){
        spaceShipRepository.deleteAll();
        spaceShipRepository.save(new SpaceShip(null, "Round", 100.0d));
        spaceShipRepository.save(new SpaceShip(null, "Pyramid", 90.0d));
        spaceShipRepository.save(new SpaceShip(null, "Cube", 100.0d));
        spaceShipRepository.save(new SpaceShip(null, "Pointy", 100.0d));
    }

}
