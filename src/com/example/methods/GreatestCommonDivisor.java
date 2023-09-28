package com.example.methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = scan.nextInt();

        System.out.println("Enter the second number: ");
        int y = scan.nextInt();

        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        gcd.GCD(x, y);
    }

    private void GCD(int x, int y) {
        int greatestDivisor = 1;

        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                greatestDivisor = i;
            }
        }

        System.out.println(greatestDivisor);
    }
}
