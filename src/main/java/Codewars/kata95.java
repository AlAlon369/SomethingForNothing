package Codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class kata95 {
    public static void main(String[] args) {
        System.out.println(sortGiftCode("abcdef"));
        System.out.println(sortGiftCode("pqksuvy"));
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
      // План
      // Создание массива
      // Сортировка массива
      // Превращение массива в стрингу, и её возврат



    public static String sortGiftCode(String code){
        char[] sortedChars = code.toCharArray();
        Arrays.sort(sortedChars);
        return new String(sortedChars);
    }
}
