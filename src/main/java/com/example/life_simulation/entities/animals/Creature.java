package com.example.life_simulation.entities.animals;

import com.example.life_simulation.entities.Entity;
import com.example.life_simulation.map.Coordinate;

public class Creature extends Entity {
    public Creature(Coordinate coordinate, boolean alive) {
        super(coordinate, alive);
    }
}
