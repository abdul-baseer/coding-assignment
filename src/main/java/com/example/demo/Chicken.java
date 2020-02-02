package com.example.demo;

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
    String sing(String habitat) throws Exception {
        throw new OperationNotSupportedException();
    }

    @Override
    Boolean canFly() {
        return false;
    }

    @Override
    Boolean canSwim() {
        return false;
    }
}