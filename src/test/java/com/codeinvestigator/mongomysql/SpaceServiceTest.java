package com.codeinvestigator.mongomysql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpaceServiceTest {

    @Autowired
    SpaceService spaceService;

    @Test
    public void createAlienAndSpaceShip() {
        try {
            spaceService.createAlienAndSpaceShip("test alien1", "tes ship 1");
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        spaceService.listAliens();
        spaceService.listSpaceShips();
    }

}