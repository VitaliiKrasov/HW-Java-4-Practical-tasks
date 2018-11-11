package com.soft.task2.weekDays;

import java.time.DateTimeException;

public enum frenchDayOfWeek {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE;

    private static final frenchDayOfWeek[] ENUMS = values();
    public static frenchDayOfWeek of(int var0) {
        if (var0 >= 1 && var0 <= 7) {
            return ENUMS[var0 - 1];
        } else {
            throw new DateTimeException("Invalid value for DayOfWeek: " + var0);
        }
    }

}
