/**
* HW4 Practical tasks1
* Enter three numbers. Find out how many of them are odd.
**/
package com.soft.task1.oddCounter;

import java.util.Scanner;

public class oddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 3; i++){

            System.out.println("Enter integer");
            if (scanner.nextInt() % 2 == 0) {
                count++;
            }

        }

        System.out.println(count + " of them are odd");
    }
}
