
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

    @Test 
    public void test2 () {
        assertEquals(13, this.object.add("1,5,7"));
        assertEquals(27, this.object.add("10,2,3,5,7"));
    }

    @Test 
    public void test3 () {
        assertEquals(6, this.object.add("1\n2,3"));
        assertEquals(16, this.object.add("2,1\n3,4\n6"));
    }

}
