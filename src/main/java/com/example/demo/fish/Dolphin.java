package com.example.demo.fish;

import com.example.demo.Animal;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Dolphin implements Animal {

    Fish fish;

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

    @Override
    public Boolean canSwim() {
        return true;
    }
}
