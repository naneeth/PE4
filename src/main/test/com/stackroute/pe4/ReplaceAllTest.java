package com.stackroute.pe4;

import com.stackroute.pe4.ReplaceAll;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {


    ReplaceAll obj;

    @Before
    public void setUp() {
        obj = new ReplaceAll();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    String inputString = "daily dry";

    @Test
    public void testReplacingSuccess() {
        String expectedValue = "faity fry", actualValue;
        actualValue = obj.replaceAll(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testReplacingFailure() {
        String expectedValue = "datly fry", actualValue;
        actualValue = obj.replaceAll(inputString);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testReplacingNullCondition() {
        String expectedValue = null, actualValue;
        actualValue = obj.replaceAll(null);
        assertEquals(expectedValue, actualValue);
    }

}

