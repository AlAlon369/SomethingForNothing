package Codewars;

import java.util.Arrays;

public class kata69 {
    public static void main(String[] args) {
        System.out.println(solve("coDe"));
        System.out.println(solve("CODe"));
        System.out.println(solve("coDE"));
        System.out.println(solve("Code"));
        System.out.println(solve(""));
    }
    // Имеем строку, которая имеет маленькие и заглавные буквы, задача состоит в том, чтобы конвертировать стрингу,
    // чтобы она содержала маленькие или только большие символы.
    // Сделать как можно меньше изменений стринги.
    // Если в строке одинаковое количество маленьких и заглавных букв, использовать toLowerCase;

    // План
    // str.toCharArray;
    // Посчитать сколько маленьких и больших букв.
    // Если элемент массива isUpperCase() countUpperCase++
    // Если элемент массива isLowerCase() countLowerCase++
    // Потом сравнить countUpperCase с countLowerCase.
    //


    public static String solve(final String str) {
        char[] charArray = str.toCharArray();
        int countLowerCase = 0;
        int countUpperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            char characterArrayElement = charArray[i];
            boolean upperCase = Character.isUpperCase(characterArrayElement);
            if (upperCase) {
                countUpperCase++;
            } else {
                countLowerCase++;
            }
        }
        if (countUpperCase > countLowerCase) {
             return str.toUpperCase();
        }
        return str.toLowerCase();
    }
}

