package com.soft.task2.weekDays;

import java.time.DateTimeException;

public enum FrenchDayOfWeek {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE;

    private static final FrenchDayOfWeek[] ENUMS = values();
    public static FrenchDayOfWeek of(int var0) {
        if (var0 >= 1 && var0 <= 7) {
            return ENUMS[var0 - 1];
        } else {
            throw new DateTimeException("Invalid value for DayOfWeek: " + var0);
        }
    }

}
