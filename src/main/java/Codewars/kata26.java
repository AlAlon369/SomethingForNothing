package Codewars;

import java.util.Arrays;

public class kata26 {
    public static void main(String[] args) {
        System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        System.out.println(twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    public static String twoSort(String[] array) {
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        int arrayLength = array[0].length();
        final String firstElement = array[0];
        for (int i = 0; i < arrayLength; i++) {
            final char letter = firstElement.charAt(i);
            sb.append(letter);
          //  if (i < arrayLength - 1)
                sb.append("***");
        }
        return sb.toString();
    }
}




