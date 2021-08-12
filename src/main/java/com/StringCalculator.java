
package com;

import java.util.*;

public class StringCalculator {
    private String in, de;
    private int invoked;

    public StringCalculator () {
        this.in = new String();
        this.de = new String();
        this.invoked = 0;

    }

    public void delimiterFinder () {
    
        Vector v = new Vector();

        char[] ch = this.in.toCharArray();

        this.de = String.valueOf(ch[2]);
    }

    public int add (String input) {
        this.invoked++;
        int count = 0;
        this.in = input;
        Vector<Integer> v = new Vector<Integer>(10);

        if (input.isEmpty()) {
            return count;
        }
        
        String []parts = input.split(this.de);
        
        for ( String st : parts ) {
            String []part = st.split("\n");
            for (String i : part) {
                try {
                    Integer.parseInt(i);
                } catch(NumberFormatException e) {
                    continue;
                }
                if (Integer.parseInt(i) < 0) {
                    v.add(Integer.parseInt(i));
                    continue;
                }
                count += Integer.parseInt(i);
            } 
        }

        if (v.size() > 0) {
            System.out.print("Negative numbers not allowed: " + v);
            return -1;
        }
        return count;
    }

    public int getCalledCount() {
        return this.invoked;
    }
}
