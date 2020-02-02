package com.example.demo;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Duck extends Bird {

    @Override
    public String sing() {
        return "Quack Quack";
    }

    @Override
    Boolean canFly() {
        return false;
    }

    @Override
    Boolean canSwim() {
        return true;
    }
}
