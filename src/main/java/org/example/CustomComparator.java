package org.example;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    public int compare(String s1, String s2) {

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }

            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }

        if (s1.length() > s2.length()) {
            return 1;
        }

        if (s1.length() < s2.length()) {
            return -1;
        }

        return 0;
    }
}
