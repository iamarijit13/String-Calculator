
package com;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private StringCalculator object;
    StringCalculatorTest () {
        this.object = new StringCalculator();
    }

    @Test 
    public void test1 () {
        assertEquals(0, this.object.add(""));
        assertEquals(1, this.object.add("1"));
        assertEquals(3, this.object.add("1,2"));
    }
}
