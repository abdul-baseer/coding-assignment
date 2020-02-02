package com.example.demo;

import com.example.demo.bird.Bird;
import com.example.demo.bird.Duck;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Solution {
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
