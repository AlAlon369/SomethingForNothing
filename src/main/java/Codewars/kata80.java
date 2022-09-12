package Codewars;

import java.util.Arrays;

public class kata80 {
    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
        System.out.println(isAnagram("Twoo", "Woot"));
        System.out.println(isAnagram("apple", "pale"));
    }
      // Анаграмма - это результат перестановки букв слова для получения нового слова.
      // Примечание: анаграммы нечувствительны к регистру.

      // Завершите возвращаемую функцию, true, если два заданных аргумента являются анаграммами друг друга,
      // Вернуть false если иначе.

      // Создание двух переменных, которые будут содержать в себе значения оригинала и тест.
      // Сравнить их длинну, если она одинакова вернуть true.
      // В остальных случаях, false.




    public static boolean isAnagram(String test, String original) {
      //  if (test.length() != original.length()) {
      //      return false;
      //  }
        String str1 = original.toLowerCase();
        String str2 = test.toLowerCase();
        char[] AnagramTest = str1.toCharArray();
        char[] AnagramOriginal = str2.toCharArray();
        Arrays.sort(AnagramTest);
        Arrays.sort(AnagramOriginal);

        return Arrays.equals(AnagramTest, AnagramOriginal);
    }
}
