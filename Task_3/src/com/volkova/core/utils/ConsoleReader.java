package com.volkova.core.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleReader {

    public static List<Integer> read(){
        System.out.println("Введиете числа через Enter,\nдля окончания ввода нажмите любой не числовой символ, например пробел");
        List<Integer> inputedNums = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean flag = true;
        while(flag) {
            String inputStr = null;
            try {
                inputStr = reader.readLine();
                int num = Integer.parseInt(inputStr);
                inputedNums.add(num);
            } catch (IOException | NumberFormatException e) {
                flag = false;
            }
        }
        return  inputedNums;
    }
}
