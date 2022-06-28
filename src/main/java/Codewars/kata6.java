package Codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class kata6 {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }


    public static String doubleChar(String s) {
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            i = s.charAt(i) + i;
            return s;


         //   String letter = array[i];
         //   System.out.println(letter);

        }

      return s;  // return s.replaceAll(".", "$0$0");
    }


}
