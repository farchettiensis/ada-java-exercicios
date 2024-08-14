package br.com.farchettiensis.exercicios;

public class LeapYear {
    static String isLeapYear(int year) {
        if (year < 0) throw new IllegalArgumentException("Invalid year");

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return String.format("%d is a leap year", year);
                } else {
                    return String.format("%d is not a leap year", year);
                }
            } else {
                return String.format("%d is a leap year", year);
            }
        } else {
            return String.format("%d is not a leap year", year);
        }
    }
}
