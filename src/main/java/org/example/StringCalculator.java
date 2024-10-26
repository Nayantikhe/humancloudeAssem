package org.example;

//Q) Given a string s, find the first non-repeating character in it and return its index.
//        If it does not exist, return -1.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n"; // Default delimiters: comma and newline
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterEndIndex));
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] tokens = numbers.split(delimiter);
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String token : tokens) {
            if (!token.isEmpty()) {
                int number = Integer.parseInt(token);
                if (number < 0) {
                    negativeNumbers.add(number);
                }
                sum += number;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }

        return sum;
    }
}