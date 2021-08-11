
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
            count += Integer.parseInt(st);
        }

        return count;
    }
}
