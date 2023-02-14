package com.volkova.core;

import com.volkova.core.utils.ConsoleReader;
import com.volkova.core.utils.NameChecker;

public class Main {
    public static void main(String[] args) {
        String inputString = ConsoleReader.read();
        NameChecker.check(inputString);
    }
}