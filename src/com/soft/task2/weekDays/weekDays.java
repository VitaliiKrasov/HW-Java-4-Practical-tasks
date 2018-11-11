/**
 * HW4 Practical tasks2
 * Enter the number of the day of the week.
 * Display the name in three languages.
 **/

package com.soft.task2.weekDays;

import java.util.Scanner;
import java.time.DayOfWeek;

public class weekDays{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number day of the week\n( integer 1 ... 7 )");
        int day = scanner.nextInt();
        System.out.println(polyglot(day));
    }

    public static String polyglot(int day) {
        return String.format("The %1$s day of week is called:\n%2$s in English\n%3$s in Spanish\n%4$s in French",
                day,
                DayOfWeek.of(day),
                spanishDayOfWeek.of(day),
                frenchDayOfWeek.of(day));
    }
}
