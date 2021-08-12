
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

    @Test 
    public void test4 () {
        assertEquals(3, this.object.add("//;\n1;2"));
        assertEquals(15, this.object.add("//;\n3;2\n4\n1;5"));
    }

    @Test 
    public void test5 () {
        assertEquals(-1, this.object.add("//;\n-1;2"));
        assertEquals(-1, this.object.add("//;\n3;2\n4\n-1;5"));
    }

    @Test 
    public void test6 () {
        assertEquals(-1, this.object.add("//;\n1;-2;-9"));
        assertEquals(-1, this.object.add("//;\n-3;2\n4\n-1;5"));
    }

    @Test 
    public void test7 () {
        StringCalculator ob = new StringCalculator();
        assertEquals(0, ob.getCalledCount());
        ob.add("//;\n1;2");
        assertEquals(1, ob.getCalledCount());
        ob.add("//;\n1;2");
        ob.add("//;\n-3;2\n4\n-1;5");
        assertEquals(3, ob.getCalledCount());
    }

    @Test 
    public void test8 () {
        assertEquals(11, this.object.add("//;\n1010;2;9"));
        assertEquals(12, this.object.add("//;\n3054;2\n4\n1;5"));
    }

}
