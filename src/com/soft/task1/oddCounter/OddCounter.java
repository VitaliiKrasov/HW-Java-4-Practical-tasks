/**
 * HW4 Practical tasks1
 * Enter three numbers. Find out how many of them are odd.
 */
package com.soft.task1.oddCounter;

import java.util.Scanner;

public class oddCounter {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            count();
        }
        System.out.println(count + " of them are odd");
    }

    static Scanner scanner = new Scanner(System.in);

    public static int scanInt() {
        System.out.println("Enter integer");
        return scanner.nextInt();
    }

    static int count = 0;
    private static void count() {
        if (scanInt() % 2 == 0) {
            count++;
        }
    }
}
