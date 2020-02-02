package com.example.demo;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public interface Animal {

    String sing();
    default void walk(){
        System.out.println("I am walking");
    }


}
