package com.company;
import java.util.Comparator;
import java.util.TreeSet;

public class Workspace {
    static int time;
    static int pages;
    int Priority;
    int randomX;


    public Workspace() {

    }

    static class StringComparator1 implements Comparator<String> {

        public int compare(String h1, String h2) {
            int t1 = Workspace.returner(h1);
            int t2 = Workspace.returner(h2);
            for (int i = 0; i < h1.length(); i++) {
                while (h1.charAt(t1 + i) == h2.charAt(t2 + i)) {
                    i++;
                    if ((i == h1.length() - t1)||((i == h2.length() - t2))){
                        for (int j = 0; j < h1.length(); j++) {
                            if ((h1.charAt(j) == '.') || ((h2.charAt(j) == '.'))) {
                                return 0;
                            }
                            while (h1.charAt(j) == h2.charAt(j)) {
                                j++;
                            }
                            if (h1.charAt(j) > h2.charAt(j)) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    }
                }
                if (h1.charAt(t1 + i) > h2.charAt(t2 + i)) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return 0;
        }
    }

    static class StringComparator2 implements Comparator<String> {

        public int compare(String h1, String h2) {
            int t1 = Workspace.returner(h1);
            int t2 = Workspace.returner(h2);
            for (int i = 0; i < h1.length(); i++) {
                while (h1.charAt(t1 + i) == h2.charAt(t2 + i)) {
                    i++;
                    if ((i == h1.length() - t1)||((i == h2.length() - t2))){
                        for (int j = 0; j < h1.length(); j++) {
                            if ((h1.charAt(j) == '.') || ((h2.charAt(j) == '.'))) {
                                return 0;
                            }
                            while (h1.charAt(j) == h2.charAt(j)) {
                                j++;
                            }
                            if (h1.charAt(j) > h2.charAt(j)) {
                                return -1;
                            } else {
                                return 1;
                            }
                        }
                    }
                }
                if (h1.charAt(t1 + i) > h2.charAt(t2 + i)) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static int returner(String h) {
        int counter = 0;
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == '.') {
                counter = i+1;
                break;
            }
        }
        return counter;
    }

    static class StringComparator3 implements Comparator<String> {

        public int compare(String h1, String h2) {
            for (int i = 0; i < h1.length(); i++) {
                if ((h1.charAt(i) == '.') || ((h2.charAt(i) == '.'))) {
                    return 0;
                }
                while (h1.charAt(i) == h2.charAt(i)) {
                    i++;
                }
                if (h1.charAt(i) > h2.charAt(i)) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return 0;
        }
    }

    static class StringComparator4 implements Comparator<String> {

        public int compare(String h1, String h2) {
            for (int i = 0; i < h1.length(); i++) {
                if ((h1.charAt(i) == '.') || ((h2.charAt(i) == '.'))) {
                    return 0;
                }
                while (h1.charAt(i) == h2.charAt(i)) {
                    i++;
                }
                if (h1.charAt(i) > h2.charAt(i)) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return 0;
        }
    }
}




