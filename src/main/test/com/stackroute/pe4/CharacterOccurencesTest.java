package com.stackroute.pe4;

import com.stackroute.pe4.CharacterOccurences;
import com.stackroute.pe4.java.CharacterOccurences;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurencesTest {

    CharacterOccurences obj;

    @Before
    public void setUp() {
        obj = new CharacterOccurences();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    String inputString = "java count occurrences of java";
    String inputChar = "a";

    @Test
    public void testOccurrenceOfCharSuccess() {
        int expectedValue = 4, actualValue;
        actualValue = obj.countOfCharacter(inputString, inputChar);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testOccurrenceOfCharFailure() {
        int expectedValue = 1, actualValue;
        actualValue = obj.countOfCharacter(inputString,inputChar1);
        assertNotEquals(expectedValue, actualValue);
    }

    String inputChar1 = "@";

    @Test
    public void testOccurrencesForCharFailure() {
        int expectedValue = 0, actualValue;
        actualValue = obj.countOfCharacter(inputString, inputChar1);
        assertEquals(expectedValue, actualValue);
    }
}