package com.example.demo.fish;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Shark extends Fish {

    @Override
    public String getSize() {
        return "large";
    }

    @Override
    public String getColour() {
        return "grey";
    }

    @Override
    public String getBehaviour() {
        return "eat other fish";
    }
}
