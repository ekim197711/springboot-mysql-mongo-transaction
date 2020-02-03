package com.codeinvestigator.mongomysql;

import com.codeinvestigator.mongomysql.mongo.Alien;
import com.codeinvestigator.mongomysql.mongo.AlienRepository;
import com.codeinvestigator.mongomysql.mysql.SpaceShip;
import com.codeinvestigator.mongomysql.mysql.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SpaceService {
    private final AlienRepository alienRepository;
    private final SpaceShipRepository spaceShipRepository;

    @Transactional(transactionManager = "chainedTransactionManager")
    public void createAlienAndSpaceShip(String alienname, String spaceshipname){
        spaceShipRepository.save(new SpaceShip(null, spaceshipname, 100.0d));
        if (true) {
            throw new RuntimeException("Something happened");
        }
        alienRepository.save(new Alien(null, alienname, 1.0d, 100.0d));
    }

    public void listAliens(){
        Iterable<Alien> all = alienRepository.findAll();
        for (Alien ss : all){
            System.out.println(ss);
        }
    }

    public void listSpaceShips(){
        Iterable<SpaceShip> all = spaceShipRepository.findAll();
        for (SpaceShip ss : all){
            System.out.println(ss);
        }
    }
}
