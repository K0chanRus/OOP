package org.example.Lison1.CalcOOP;

import java.text.DecimalFormat;

public class Calculation extends CalcOOP{
    public static String sumResult(String exemple, String field, char inChar) {
        if (inChar == '+') {
            if (exemple.length() > 0) {
                double intExemple = Double.parseDouble(exemple);
                double intField = Double.parseDouble(field);
                double resault = intExemple + intField;
                return String.valueOf(resault);
            }
        }
        if (inChar == '-') {
            if (exemple.length() > 0) {
                double intExemple = Double.parseDouble(exemple);
                double intField = Double.parseDouble(field);
                double resault = intExemple - intField;
                return String.valueOf(resault);
            }
        }
        if (inChar == '*') {
            if (exemple.length() > 0) {
                double intExemple = Double.parseDouble(exemple);
                double intField = Double.parseDouble(field);
                double resault = intExemple * intField;
                return String.valueOf(resault);
            }
        }
        if (inChar == '/') {
            if (exemple.length() > 0) {
                double intExemple = Double.parseDouble(exemple);
                double intField = Double.parseDouble(field);
                double resault = intExemple / intField;
                return String.valueOf(resault);
            }
        }
        double intField = Double.parseDouble(field);
        return String.valueOf(intField);
    }

    public static String sumResult(String field){
        double intField = Double.parseDouble(field);
        return String.valueOf(intField);
    }
}
