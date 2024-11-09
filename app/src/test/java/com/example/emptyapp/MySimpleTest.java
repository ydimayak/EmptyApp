package com.example.emptyapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * My simple unit test
 */
public class MySimpleTest {
    @Test
    public void multiply_isCorrect() {
        assertEquals(6, 2 * 3);
        assertNotEquals(7, 2 * 3);
    }
}
