package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kata101 {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("  nAa"));
        System.out.println(hasUniqueChars("abcde"));
        System.out.println(hasUniqueChars("++-"));
        System.out.println(hasUniqueChars("AaBbc"));
    }
    // напишите программу которая определяет, содержит ли строка только уникальные символы.
    // Вернуть true если это так, в противном случае false
    // Строка может содержать любой из 128 символов ASCII. Символы чувствительны к регистру.
    // Например "a" и "A" считаются разными символами.

    // План
    // Сплит строки
    // Бегу по массиву, возвращаю тру если символ уникален, false если он повторяется
    // Использую методы equals, contains.

    public static boolean hasUniqueChars(String str) {
        String chars[] = str.split("");
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++)
            if (chars[i].equals(chars[i - 1])) {
                return false;
            }
        return true;
    }
}




