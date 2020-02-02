package com.example.demo;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Chicken extends Bird {

    @Override
    public String sing() {
        return "Cluck Cluck";
    }

    @Override
    Boolean canFly() {
        return false;
    }

    @Override
    Boolean canSwim() {
        return false;
    }
}
