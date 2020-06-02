package com.company;

import java.util.Comparator;

class StringComparator4 implements Comparator<String> {

    public int compare(String h1, String h2) {
        int j = 0;
        while (h1.charAt(j) == h2.charAt(j)) {
            j++;
            if ((h1.charAt(j) == '.') || ((h2.charAt(j) == '.'))) {
                return 0;
            }
        }
        if (h1.charAt(j) > h2.charAt(j)) {
            return -1;
        } else {
            return 1;
        }
    }
}
