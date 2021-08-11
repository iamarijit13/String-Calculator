
package com;

import java.util.*;

public class StringCalculator {
    public int add (String input) {
        int count = 0;

        if (input.isEmpty()) {
            return count;
        }

        String []parts = input.split(",");
        
        for ( String st : parts ) {
            String []part = st.split("\n");
            for (String i : part) {
                count += Integer.parseInt(i);
            } 
        }

        return count;
    }
}
