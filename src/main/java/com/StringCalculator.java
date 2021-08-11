
package com;

import java.util.*;

public class StringCalculator {
    private String in, de;

    public StringCalculator () {
        in = new String();
        de = new String();
    }

    public void delimiterFinder () {
    
        Vector v = new Vector();

        char[] ch = this.in.toCharArray();

        this.de = String.valueOf(ch[3]);
    }

    public int add (String input) {
        int count = 0;
        this.in = input;

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
                count += Integer.parseInt(i);
            } 
        }

        return count;
    }
}
