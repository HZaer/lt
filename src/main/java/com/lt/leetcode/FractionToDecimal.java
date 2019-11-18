package com.lt.leetcode;

public class FractionToDecimal {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4, 333));
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            throw new NumberFormatException("denominator is zero");
        }
        if (numerator % denominator == 0) {
            return String.valueOf(numerator / denominator);
        }
        double divisor = ((double) numerator) / denominator;
        String result = String.valueOf(divisor);
        String[] array = result.split("\\.");
        String decimal = array[1];
        StringBuffer sb = new StringBuffer();
        if (decimal.length() > 2 && decimal.charAt(0) == decimal.charAt(1)) {
            sb.append(array[0]).append(".").append("(").append(decimal.charAt(1)).append(")");
        } else {
            sb.append(result);
        }
        return sb.toString();
    }
}
