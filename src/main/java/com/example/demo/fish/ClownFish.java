package com.example.demo.fish;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class ClownFish extends Fish {

    @Override
    public String getSize() {
        return "small";
    }

    @Override
    public String getColour() {
        return "colourful (orange)";
    }

    @Override
    public String getBehaviour() {
        return "make jokes";
    }
}
