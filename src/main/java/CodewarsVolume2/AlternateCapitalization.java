package CodewarsVolume2;

import java.util.Arrays;

public class AlternateCapitalization {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.capitalize("abcdef")));
    System.out.println(Arrays.toString(Solution.capitalize("codewarriors")));
    System.out.println(Arrays.toString(Solution.capitalize("abrakadabra")));
    System.out.println(Arrays.toString(Solution.capitalize("codewars")));

  }

  // План
  // Нам дана стринга, ката подразумивает разбор стринги, где нужно озаглавить каждый четный и нечетный индекс.
  // Нам известно что инпут (стринга) не будет иметь пробелов, а также будет в формате лоуеркейс.
  // Решение через стринг билдер.
  // Создаем два стринг билдера, бежим по циклу фор.
  // Если остаток отделение == 0,- записываем в четные, если нет, то в нечетные.
  // Записывая, оглавляем, или наоборот
  class Solution {
    public static String[] capitalize(String s) {
      StringBuilder evenChars = new StringBuilder(); // Четные
      StringBuilder oddChars = new StringBuilder();  // Нечетные

      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {                            // Если остаток отделения на 2 равен 0,
                                                     // значит записываем чар под индексом Апперкейс, нечетный лоуеркейс.
          evenChars.append(Character.toUpperCase(s.charAt(i)));
          oddChars.append(Character.toLowerCase(s.charAt(i)));
        } else {
          evenChars.append(Character.toLowerCase(s.charAt(i)));
          oddChars.append(Character.toUpperCase(s.charAt(i)));
        }
      }

      return new String[]{evenChars.toString(), oddChars.toString()};
    }
  }
}
