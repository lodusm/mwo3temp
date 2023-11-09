package com.mwolab2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    void testAverage() {
        HelloWorld helloWorld = new HelloWorld();
        double result = helloWorld.average(3.0, 5.0);
        assertEquals(4.0, result, 0.0001); // Using delta for double comparison
    }

    @Test
    void testIsEven() {
        HelloWorld helloWorld = new HelloWorld();

        assertTrue(helloWorld.isEven(2));
        assertFalse(helloWorld.isEven(3));
        assertTrue(helloWorld.isEven(0));
        assertFalse(helloWorld.isEven(-1));
    }

    @Test
    void testIsNotEven() {
        HelloWorld helloWorld = new HelloWorld();

        assertFalse(helloWorld.isNotEven(2));
    
    }
}


