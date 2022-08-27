package Codewars;

import java.util.Arrays;

public class kata54 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }







    public static String[] stringToArray(String s) {
        String[] words = s.split(" ");

     return words;
  }
}
