import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {

    TransposeOfString obj;

    @Before
    public void setUp() {
        obj = new TransposeOfString();
    }

    @After
    public void tearDown() {
        obj = null;
    }



    @Test
    public void testTransposeSuccess() {
        String inputString = "my name is akuthota naneeth";
        String expectedValue = "ym eman si atohtuka hteenan" , actualValue;
        actualValue = obj.transpose(inputString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testTransposeFailure() {
        String inputString = "nan is good";
        String expectedValue = "nan is good", actualValue;
        actualValue = obj.transpose(inputString);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    public void testTransposeNullValue() {
        String inputString = "";
        String expectedValue = null, actualValue;
        actualValue = obj.transpose(inputString);
        assertEquals(expectedValue, actualValue);
    }
}












