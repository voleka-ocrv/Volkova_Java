package com.volkova.core.utils;

public class NameChecker {

    public static void check(String inputStr) {
        if (inputStr.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
