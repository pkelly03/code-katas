package com.learning;

import org.junit.*;

import static org.junit.Assert.*;

public class IterativeReverseStringTest {

    @Test
    public void should() {
        IterativeReverseString reverser = new IterativeReverseString();
        assertEquals(reverser.reverse("abcd"), "dcba");

    }

}
