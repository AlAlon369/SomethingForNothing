package Codewars;

import java.util.Arrays;
import java.util.regex.Pattern;

public class kata21 {
    public static void main(String[] args) {
        System.out.println(reverseWords("The world is nice"));


    }
// Завершить решение, чтобы оно перевернуло все слова в переданной строке
// Мы получаем стринги (str), имеет метод reverseWords


    public static String reverseWords(String str) {
        String[] array = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
            result.append(" ");
        }
        return new String(result).trim();

        //return str.split(" ").reverse().join(" ");
        // 1. Почитать про split. 2. Запустить debug, array.length. 3. Прочитать про стринг билдер.

    }
}

