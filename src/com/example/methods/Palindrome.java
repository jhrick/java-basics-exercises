package com.example.methods;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = scan.next();

        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(word);
    }

    private void checkPalindrome(String word) {
        char[] wordChars = word.toCharArray();

        char[] wordCharsBackwards = new char[wordChars.length];

        for (int i = (wordChars.length - 1); i >= 0; i--) {
            wordCharsBackwards[(wordChars.length - 1) - i] = wordChars[i];
        }

        String wordBackwards = String.valueOf(wordCharsBackwards);

        if (Objects.equals(wordBackwards, word)) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is a not palindrome");
        }
    }
}
