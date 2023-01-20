package com.slidingwindow;

import java.util.HashSet;
import java.util.Set;

class ShortestBalancedSubstring {

    public static void main(String[] args) {
        System.out.println(find("azABaabza"));
        System.out.println(find("AcZCbaBz"));

    }
    public static int find(String s) {
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        String res = s;
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (Character.isLowerCase(c) && set.contains(Character.toUpperCase(c))) {
                sb.append(c);
            } else if (Character.isUpperCase(c) && set.contains(Character.toLowerCase(c))) {
                sb.append(c);
            } else {
                if (sb.length() > 1 && res.length() > sb.length()) {
                    res = sb.toString();
                    isValid = true;
                }
                sb = new StringBuilder();
            }
        }

        if (sb.length() > 1 && res.length() >= sb.length()) {
            res = sb.toString();
            isValid = true;
        }

        return res == s && !isValid ? -1 : res.length();
    }

}