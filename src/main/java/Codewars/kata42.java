package Codewars;

import java.util.Arrays;
import java.util.Objects;

public class kata42 {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }

    // Исограмма - это слово, в котором нет повторяющихся букв, последовательных или непоследовательных.
    // Реализуйте функцию, определяющую является ли строка, содержащей только буквы, изограммой.
    // Пустая строка является - изограммой.
    // Игнорировать регистр букв.

    // План
    // Прочитать, Метод equalsIgnoreCase()
    // Создание массива, спит стринги str.
    // в foriche пробежатся по массива, и при условии (if)  array[i] == array[i] < бегу по массиву, и смотрю есть ли повторы
    // Если буквы повторяются, допустим moO - (o) повторосилось, retern false;
    // Загуглить как сравнивать два array, прочитать про array.sortOf
    // Пустая строка исограмма, if str = "" return true;

    public static boolean isIsogram(String str) {
        if (str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        int trueLength = str.length();
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < trueLength -1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

