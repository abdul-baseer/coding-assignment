package com.example.demo.fish;

import com.example.demo.Animal;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Fish implements Animal {

    public String size;
    public String colour;
    public String behaviour;

    @Override
    public Boolean canWalk() {
        return false;
    }

    @Override
    public Boolean canFly() {
        return false;
    }

    @Override
    public Boolean canSing() {
        return false;
    }

    public Boolean canSwim() {
        return true;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getBehaviour() {
        return behaviour;
    }
}
