package com.stackroute.pe4;

import com.stackroute.pe4.FindHarry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {
    FindHarry obj;

    @Before
    public void setUp() {
        obj = new FindHarry();
    }

    @After
    public void tearDown() {
        obj = null;
    }


    String inputString = "hello Harry how are you";

    @Test
    public void testReplacingSuccess() {
        String expectedValue = "Is Harry here ?true", actualValue;
        actualValue = obj.findingHarry(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testReplacingFailure() {
        String expectedValue = "Is Harry here ?false", actualValue;
        actualValue = obj.findingHarry(inputString);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testReplacingNullCondition() {
        String expectedValue = null, actualValue;
        actualValue = obj.findingHarry(null);
        assertEquals(expectedValue, actualValue);
    }


}