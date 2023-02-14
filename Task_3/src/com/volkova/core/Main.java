package com.volkova.core;

import com.volkova.core.utils.ArrayChecker;
import com.volkova.core.utils.ConsoleReader;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> inputedNums = new ArrayList<>();
        inputedNums = ConsoleReader.read();
        ArrayChecker.check(inputedNums);
    }
}
