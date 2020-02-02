package com.example.demo;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public abstract class Bird implements Animal {
    void fly() {
        System.out.println("I am flying");
    }

    @Override
    public String sing() {
        return "I am singing";
    }

    abstract Boolean canFly();

    abstract Boolean canSwim();
}