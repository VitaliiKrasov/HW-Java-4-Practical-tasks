package com.soft.task2.weekDays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class weekDaysTest {
    String expected = "The 1 day of week is called:\n" +
            "MONDAY in English\n" +
            "LUNES in Spanish\n" +
            "LUNDI in French";

    @Test
    void polyglot() {
        assertEquals(expected, weekDays.polyglot(1));
    }
}