package com.volkova.core.utils;

public class NumberChecker {

    public static void check(Double number) {
        if (number != null) {
            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Введите число больше 7");
            }
        }
    }
}
