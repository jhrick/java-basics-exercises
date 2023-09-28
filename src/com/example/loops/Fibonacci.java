package com.example.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number of sequence: ");
        int firstNum = scan.nextInt();

        System.out.println("Now, the second number of sequence: ");
        int secondNum = scan.nextInt();

        System.out.println("And, how many numbers your want show in sequence?");
        int qtdNumbers = scan.nextInt();

        ArrayList<Integer> fibonacciSequence = new ArrayList<>();

        for (int i = 0; i <= (qtdNumbers - 2); i++ ) {
            if (fibonacciSequence.isEmpty()) {
                fibonacciSequence.add(firstNum);
            }

            fibonacciSequence.add(secondNum);

            secondNum += firstNum;
            firstNum = secondNum - firstNum;
        }

        for (int num : fibonacciSequence) {
            System.out.print(num + ", ");
        }
    }
}
