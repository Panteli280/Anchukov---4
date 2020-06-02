package com.company;

import java.util.Comparator;

class StringComparator2 implements Comparator<String> {

    public int compare(String h1, String h2) {
        int d1 = NameComparator.dot(h1);
        int d2 = NameComparator.dot(h2);
        int i = 0;
        while (h1.charAt(d1 + i) == h2.charAt(d2 + i)) {
            i++;
            if ((i == h1.length() - d1) || ((i == h2.length() - d2))) {
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
        if (h1.charAt(d1 + i) > h2.charAt(d2 + i)) {
            return -1;
        } else {
            return 1;
        }
    }
}
