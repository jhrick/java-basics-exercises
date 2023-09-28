package com.example.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("\nMultiplication Table:");
        System.out.println("---------------------\n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
