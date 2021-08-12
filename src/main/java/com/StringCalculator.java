
package com;

import java.util.*;

public class StringCalculator {
    private String in, de, de1;
    private int invoked;

    public StringCalculator () {
        this.in = new String();
        this.de = new String();
        this.invoked = 0;

    }

    public void delimiterFinder () {
        int i;
        Vector v = new Vector();
        Vector v1 = new Vector();
        char[] ch = this.in.toCharArray();
        for (i = 3; ch[i] != ']'; i++) {
            v.add(ch[i]);
        }
        for (i = i+=2; ch[i] != ']'; i++) {
            v1.add(ch[i]);
        }
        this.de = String.valueOf(v);
        this.de1 = String.valueOf(v1);
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
        
        for ( String i : parts) {
            String []par = i.split(this.de1);
            for (String k : par) {
                String []part = k.split("\n");
                for ( String j : part) {
                    try {
                        Integer.parseInt(j);
                    } catch(NumberFormatException e) {
                        continue;
                    }
                    if (Integer.parseInt(j) < 0) {
                        v.add(Integer.parseInt(j));
                        continue;
                    }
                    if(Integer.parseInt(j) > 1000) {
                        continue;
                    }
                    count += Integer.parseInt(j);
                }
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
