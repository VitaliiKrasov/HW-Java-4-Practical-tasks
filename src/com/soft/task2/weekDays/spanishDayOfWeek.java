package com.soft.task2.weekDays;

import java.time.DateTimeException;

public enum spanishDayOfWeek {
    LUNES,
    MARTES,
    MIÉRCOLES,
    JUEVES,
    VIERNES,
    SÁBADO,
    DOMINGO;

    private static final spanishDayOfWeek[] ENUMS = values();
    public static spanishDayOfWeek of(int var0) {
        if (var0 >= 1 && var0 <= 7) {
            return ENUMS[var0 - 1];
        } else {
            throw new DateTimeException("Invalid value for DayOfWeek: " + var0);
        }
    }
}
