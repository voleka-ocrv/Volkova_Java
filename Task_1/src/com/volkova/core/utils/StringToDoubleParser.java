package com.volkova.core.utils;

public class StringToDoubleParser {

    public static Double parse(String inputString){
        Double number = null;
        try {
            if (inputString.contains(","))
                inputString = inputString.replace(',', '.');
            number = Double.parseDouble(inputString);
        } catch (NumberFormatException ex){
            System.out.println("Введено не число");
        }
        return number;
    }
}
