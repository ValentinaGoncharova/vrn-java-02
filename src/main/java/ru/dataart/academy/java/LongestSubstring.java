package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int maxLength = 0;
        HashSet<Character> subStr = new HashSet<Character>();
        int start = 0;
        int end = 0;
        while (start < checkString.length() && end < checkString.length()) {
            if (subStr.contains(checkString.charAt(end))) {
                subStr.remove(checkString.charAt(start));
                start = start + 1;
            } else {
                subStr.add(checkString.charAt(end));
                end = end + 1;
                if (end - start > maxLength) {
                    maxLength = end - start;
                }
            }
        }
        return maxLength;
    }
}