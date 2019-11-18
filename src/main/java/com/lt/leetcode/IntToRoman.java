package com.lt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数转换为罗马数字
 */
public class IntToRoman {
    String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
    int subscript = 1, c = 1;
    List<String> romanStr = new ArrayList<>();

    public String intToRoman(int num) {
        if (num == 1) {
            return roman[0];
        }
        if (num == 5) {
            return roman[1];
        }
        if (num == 10) {
            return roman[2];
        }
        if (num == 50) {
            return roman[3];
        }
        if (num == 100) {
            return roman[4];
        }
        if (num == 500) {
            return roman[5];
        }
        if (num == 1000) {
            return roman[6];
        }
        int single;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            single = num % 10;
            num = num / 10;
            if (single == 0 && num == 0) {
                break;
            }
            calRoman(single);
        }
        for (int i = romanStr.size() - 1; i >= 0; i--) {
            sb.append(romanStr.get(i));
        }
        return sb.toString();
    }

    private void calRoman(int single) {
        String romanFive = "";
        if (single < 5) {
            if (4 == single) {
                romanFive = roman[subscript - 1] + roman[subscript];
            } else {
                while (single != 0) {
                    romanFive += roman[subscript - 1];
                    single--;
                }
            }
        } else if (single == 5) {
            romanFive = roman[subscript];
        } else {
            if (9 == single) {
                romanFive = roman[subscript - 1] + roman[subscript + 1];
            } else {
                single = single - 5;
                romanFive += roman[subscript];
                while (single != 0) {
                    romanFive = romanFive + roman[subscript - 1];
                    single--;
                }
            }
        }
        romanStr.add(romanFive);
        subscript = subscript + 2;
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(58));
    }
}
