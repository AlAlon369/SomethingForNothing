package Codewars;

import java.util.Arrays;

public class kata75 {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
     //   System.out.println(validatePin("0000"));
     //   System.out.println(validatePin("1111"));
     //   System.out.println(validatePin("123456"));
//        System.out.println(validatePin("098765"));
//        System.out.println(validatePin("000000"));
//        System.out.println(validatePin(".234"));
//        System.out.println(validatePin("00000000"));
   //     System.out.println(validatePin("12.0"));
    }
    // Банкоматы позволяют использовать 4-ех или 6-ти значные PIN-коды, а PIN-коды не могут содержать ничего,
    // кроме ровно 4 или ровно 6 цифр.

    // Если функции передана допустимая строка PIN-кода, верните true, иначе верните false.

    // План
    // toCharArray, получаю массив чарактером
    // if (pin.length() != 4 && pin.length() != 6) {
    // return false;

    // Бегу по массиву чарактеров, и спрашиваю isdigit, если false - return false;

    // Создать массив
    // Сортировка массива
    // Пробежаться по массиву, узнать длинну
    // Если длинна не ровна 4, или 6, return false
    // Далее сравнить элементы массива, и если они меньше "0" или больше "9" return falseю


    public static boolean validatePin(String pin) {
        char[] charArray = pin.toCharArray();
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            char characterArrayElement = charArray[i];
            boolean isDigits = Character.isDigit(characterArrayElement);
            if (!isDigits) {
                return false;
            }
        }
        return true;
    }
}