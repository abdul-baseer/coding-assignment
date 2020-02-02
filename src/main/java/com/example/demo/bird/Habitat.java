package com.example.demo.bird;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public enum Habitat {

    HOUSE_WITH_DOGS("houseWithDogs"),
    HOUSE_WITH_CATS("houseWithCats"),
    FARM_NEAR_ROOSTER("farmNearRooster");


    String habitatString;

    Habitat(String habitatString) {
        this.habitatString = habitatString;
    }
}
