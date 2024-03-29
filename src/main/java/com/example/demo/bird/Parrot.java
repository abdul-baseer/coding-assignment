package com.example.demo.bird;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Parrot extends Bird {

    @Override
    public String sing(String habitat) throws Exception {
        if (Habitat.HOUSE_WITH_DOGS.toString().equalsIgnoreCase(habitat)) {
            return "Woof, woof";
        } else if(Habitat.HOUSE_WITH_CATS.toString().equalsIgnoreCase(habitat)) {
            return "Meow";
        } else if(Habitat.FARM_NEAR_ROOSTER.toString().equalsIgnoreCase(habitat)){
            return "Cock-a-doodle-doo";
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public Boolean canWalk() {
        return true;
    }

    @Override
    public Boolean canFly() {
        return true;
    }

    @Override
    public Boolean canSing() {
        return true;
    }

    @Override
    public Boolean canSwim() {
        return false;
    }
}
