package com.example.demo.other;

import com.example.demo.Animal;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Butterfly implements Animal {

    @Override
    public Boolean canSwim() {
        return false;
    }

    public Boolean canFly() {
        return true;
    }

    public Boolean makeSound() {
        return false;
    }
}
