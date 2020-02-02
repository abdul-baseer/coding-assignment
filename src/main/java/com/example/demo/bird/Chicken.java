package com.example.demo.bird;

import javax.naming.OperationNotSupportedException;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Chicken extends Bird {

    @Override
    public String sing() {
        return "Cluck Cluck";
    }

    @Override
    public String sing(String habitat) throws Exception {
        throw new OperationNotSupportedException();
    }

    @Override
    public Boolean canWalk() {
        return true;
    }

    @Override
    public Boolean canFly() {
        return false;
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
