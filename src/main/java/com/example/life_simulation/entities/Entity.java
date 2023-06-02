package com.example.life_simulation.entities;

import  com.example.life_simulation.map.Coordinate;
public class Entity {
    Coordinate coordinate;
    private boolean alive;

    public Entity(Coordinate coordinate, boolean alive) {
        this.coordinate = coordinate;
        this.alive = alive;
    }
}
