package com.example.demo;

import com.example.demo.bird.Bird;
import com.example.demo.bird.Duck;

import java.util.List;

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

        // Assume this list is containing list of all the animals
        List<Animal> animals = null;

        Integer flyingAnimalCount = 0;
        Integer walkingAnimalCount = 0;
        Integer singingAnimalCount = 0;
        Integer swimmingAnimalCount = 0;

        for (Animal animal : animals) {
            if (animal.canFly()) {
                flyingAnimalCount++;
            }
            if (animal.canSing()) {
                singingAnimalCount++;
            }
            if (animal.canWalk()) {
                walkingAnimalCount++;
            }
            if (animal.canSwim()) {
                swimmingAnimalCount++;
            }
        }



    }
}
