package com.volkova.core.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public static String read() {
        System.out.println("Пожалуйста, введите имя ...");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String inputStr = null;
        try {
            inputStr = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return inputStr;
    }
}
