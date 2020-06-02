package com.company;

public class NameComparator {

    public static int dot(String h) {
        int counter = 0;
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == '.') {
                counter = i+1;
                break;
            }
        }
        return counter;
    }
}




