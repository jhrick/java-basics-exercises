package com.example.condictionals;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the max number: ");
        int max = scan.nextInt();

        System.out.println("Now, enter the min number: ");
        int min = scan.nextInt();

        double randomNum = Math.random();
        int numSorted = (int) Math.floor((randomNum * max) + min);

        System.out.println("Try to guess the number: ");
        int response = scan.nextInt();

        while (response != numSorted) {
            System.out.println("Ops, this was not the number drawn. Try again: ");
            response = scan.nextInt();
        }

        System.out.println("You're right! The number it was " + numSorted);
    }
}
