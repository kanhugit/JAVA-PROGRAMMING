package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceConsonantLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input list of strings
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        // Lambda to check if a character is a consonant
        ConsonantChecker isConsonant = (char c) -> {
            c = Character.toLowerCase(c);
            return "bcdfghjklmnpqrstvwxyz".contains(c + "");
        };

        // Lambda to find the nearest vowel to a consonant
        NearestVowelFinder findNearestVowel = (char c) -> {
            c = Character.toLowerCase(c);
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            char nearestVowel = 'a'; // Default to 'a'
            int minDistance = Integer.MAX_VALUE;

            for (char vowel : vowels) {
                int distance = Math.abs(c - vowel);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestVowel = vowel;
                }
            }
            return nearestVowel;
        };

        // Modify strings
        ArrayList<String> modifiedStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > 0 && isConsonant.check(str.charAt(0))) {
                char nearestVowel = findNearestVowel.find(str.charAt(0));
                modifiedStrings.add(nearestVowel + str.substring(1));
            } else {
                modifiedStrings.add(str); // Keep unchanged if starts with vowel or empty
            }
        }

        // Output results
        System.out.println("Modified Strings:");
        System.out.println(modifiedStrings);
    }

    // Functional interface for consonant check
    @FunctionalInterface
    interface ConsonantChecker {
        boolean check(char c);
    }

    // Functional interface for finding nearest vowel
    @FunctionalInterface
    interface NearestVowelFinder {
        char find(char c);
    }
}

