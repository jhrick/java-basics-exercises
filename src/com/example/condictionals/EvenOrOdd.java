package com.example.condictionals;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scan.nextInt();

        if (x % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }

        System.out.println("Again? Yes or No?");
        String response = scan.next();

        if (response.equalsIgnoreCase("yes")) {
            main(args);
        }
        System.exit(200);
    }
}
