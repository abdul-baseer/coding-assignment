package com.example.demo;


import com.example.demo.bird.Bird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author baseer
 * Date: 02/02/2020
 */
public class BirdTest {

    public static final String VALID_SONG = "I am singing";
    public static final String INVALID_SONG = "I am not singing";
    @Test
    public void sing_success() {
        Bird bird = new Bird();
         Assertions.assertEquals(bird.sing(), VALID_SONG);
    }

    @Test
    public void sing_failure() {
        Bird bird = new Bird();
        Assertions.assertNotEquals(bird.sing(), INVALID_SONG);
    }
}
