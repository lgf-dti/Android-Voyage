package com.example.voyage;

import junit.framework.TestCase;

public class SejourTest extends TestCase {

    public void testPrix() {
        Sejour sejour = new Sejour(null, 0, 3, 60);
        assertEquals(180, sejour.prix(), 1e-2);
    }
}