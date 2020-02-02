package com.example.demo.fish;

import com.example.demo.Animal;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Dolphin implements Animal {

    Fish fish;

    @Override
    public Boolean canSwim() {
        return true;
    }
}
