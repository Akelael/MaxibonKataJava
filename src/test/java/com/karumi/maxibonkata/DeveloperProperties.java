package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class) public class DeveloperProperties {
    private static final String ANY_NAME = "Pedro";

    @Property public void shouldReturnZeroOrMoreMaxibons(int numberOfMaxibons) {
        Developer developer = new Developer(ANY_NAME, numberOfMaxibons);
        System.out.println(developer);
        assertTrue(developer.getNumberOfMaxibonsToGrab() >= 0);
    }

    @Test public void shouldReturnTheCorrectNumberOfMaxibonsToGrabPerDeveloper() {
        assertEquals(Karumies.PEDRO.getNumberOfMaxibonsToGrab(), 3);
        assertEquals(Karumies.JORGE.getNumberOfMaxibonsToGrab(), 1);
        assertEquals(Karumies.ALBERTO.getNumberOfMaxibonsToGrab(), 1);
        assertEquals(Karumies.DAVIDE.getNumberOfMaxibonsToGrab(), 0);
        assertEquals(Karumies.SERGIO.getNumberOfMaxibonsToGrab(), 2);
    }
}
