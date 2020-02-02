package com.example.demo.bird;

import javax.naming.OperationNotSupportedException;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class Duck extends Bird {

    @Override
    public String sing() {
        return "Quack Quack";
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
    public Boolean canSwim() {
        return true;
    }
}
