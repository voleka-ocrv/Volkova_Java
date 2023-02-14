package com.volkova.core.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayChecker {

    public static void check(List<Integer> inputedNums) {
        List<Integer> filteredNums = inputedNums.stream().filter(x -> x%3 == 0).collect(Collectors.toList());
        if (filteredNums.size() == 0) {
            System.out.println("Массив не содержит элементов кратных 3");
        } else {
            System.out.println("Элементы массива кратные 3:");
            filteredNums.forEach(x -> System.out.println(x));
        }
    }
}
