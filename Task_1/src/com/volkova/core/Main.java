package com.volkova.core;

import com.volkova.core.utils.ConsoleReader;
import com.volkova.core.utils.NumberChecker;
import com.volkova.core.utils.StringToDoubleParser;

public class Main {
    public static void main(String[] args) {

        String inputString = ConsoleReader.read();
        Double number = StringToDoubleParser.parse(inputString);
        NumberChecker.check(number);
    }
}