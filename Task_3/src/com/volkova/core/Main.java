package com.volkova.core;

import com.volkova.core.utils.ArrayChecker;
import com.volkova.core.utils.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> inputedNums = new ArrayList<>();
        inputedNums = ConsoleReader.read();
        ArrayChecker.check(inputedNums);
    }
}