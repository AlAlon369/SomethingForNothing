package CodewarsVolume2;

import java.util.Arrays;

public class Digitize {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.digitize(123)));      // [1, 2, 3]
    System.out.println(Arrays.toString(Solution.digitize(1)));        // [1]
    System.out.println(Arrays.toString(Solution.digitize(8675309))); // [8, 6, 7, 5, 3, 0, 9]
  }

  // План
  // На вход подается неотрицательное число n
  // Нужно вернуть массив, содержащий его цифры, в том же порядке.
  // Нужно разделить число n на цифры. Преобразовать n в строку.

  // Чтобы преобразовать символы в числа, нам нужно пройтись по массиву и запарсить char в int

  // Создать массив целых чисел и записать в него преобразованные цифры.

  public static class Solution {
    public static int[] digitize(int n) {
      // Преобразуем число в строку, затем разбиваем строку на символы
      char[] chars = String.valueOf(n).toCharArray();

      // Создаем массив для цифр
      int[] digits = new int[chars.length];

      // Преобразуем каждый символ в int и записываем в массив
      for (int i = 0; i < chars.length; i++) {
        digits[i] = Character.getNumericValue(chars[i]);
      }

      return digits;
    }
  }
}