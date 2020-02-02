package com.example.demo.bird;

import com.example.demo.Animal;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public abstract class Bird implements Animal {
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public String sing() {
        return "I am singing";
    }

    abstract String sing(String habitat) throws Exception;

    abstract Boolean canFly();

    abstract Boolean canSwim();
}