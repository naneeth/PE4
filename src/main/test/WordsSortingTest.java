import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsSortingTest {


        WordsSorting obj;

        @Before
        public void setUp() {
            obj = new WordsSorting();
        }

        @After
        public void tearDown() {
            obj = null;
        }



        @Test
        public void testWordsSortingSuccess() {
            String inputString = "my name is akuthota naneeth";
            String expectedValue = "akuthota is my name naneeth" , actualValue;
            actualValue = obj.wordsSorting(inputString);
            assertEquals(expectedValue, actualValue);
        }

        @Test
        public void testWordsSortingFailure() {
            String inputString = "nan is good";
            String expectedValue = "nan is good", actualValue;
            actualValue = obj.wordsSorting(inputString);
            assertNotEquals(expectedValue, actualValue);
        }


        @Test
        public void testWordsSortingNullValue() {
            String inputString = "";
           String expectedValue = null, actualValue;
            actualValue = obj.wordsSorting(inputString);
            assertEquals(expectedValue, actualValue);
        }
    }












