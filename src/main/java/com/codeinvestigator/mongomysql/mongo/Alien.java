package com.codeinvestigator.mongomysql.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alien {
    @Id
    private String id;
    private String name;
    private Double height;
    private Double weight;

}
