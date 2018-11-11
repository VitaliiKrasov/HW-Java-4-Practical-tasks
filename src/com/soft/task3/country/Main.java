/**
 * HW4 Practical tasks3
 * Enter the name of the Сountry.
 * Print the name of the continent.
 * (Declare enum with names of Сontinent)
 * **/

package com.soft.task3.country;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The program is currently under construction.\nIt currently only has information about some countries.");
        System.out.println("Enter the name of the Country");
        String input = getString().toUpperCase();
        System.out.println(Continent.getContinent(input));
    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
