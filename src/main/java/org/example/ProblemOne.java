package org.example;

import java.util.Arrays;

public class ProblemOne {
    public boolean isAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        char[] firstChars = firstWord.toCharArray();
        char[] secondChars = secondWord.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        return Arrays.equals(firstChars, secondChars);
    }
}
