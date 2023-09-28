package com.example.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        ArrayList<Integer> factorial = new ArrayList<>();

        for (int i = num; i > 0; i--) {
            factorial.add(i);
        }

        int result = 1;

        System.out.printf("%d! = ", num);

        for (int i = 0; i <= (factorial.size() - 1); i++) {
            int el = factorial.get(i);

            result *= el;

            if (i >= (factorial.size() - 1)) {
                System.out.print(el + " = " + result);
                return;
            }

            System.out.print(el + " * ");
        }
    }
}
