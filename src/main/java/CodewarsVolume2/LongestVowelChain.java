package CodewarsVolume2;

public class LongestVowelChain {
  public static void main(String[] args) {
    System.out.println(Solution.solve("codewarriors")); // 2
    System.out.println(Solution.solve("beautiful"));    // 3
    System.out.println(Solution.solve("sequence"));     // 3
    System.out.println(Solution.solve("strength"));     // 0
    System.out.println(Solution.solve("aaaaa"));        // 5
  }

  // План:
  // В строке нужно найти самую длинную последовательность подряд идущих гласных.
  // Создать стринговую переменную которая будет хранить гласные чары: a, e, i, o, u.
  // Нужна переменная для отслеживания текущей длинны гласных
  // Нужна переменная для ослеживания длинны гласных, а также переменная для хранения максимальной длины повторяющихся гласных
  // Итерироваться по каждому символу в строке.

   class Solution {
    public static int solve(String s) {
      // Массив гласных для проверки
      String vowels = "aeiou";
      // Переменные для текущей длины гласной цепочки и максимальной длины
      int currentLength = 0;
      int maxLength = 0;

      // Проход по строке
      for (char c : s.toCharArray()) {
        if (vowels.indexOf(c) != -1) { // Если символ гласная
          currentLength++; // Увеличиваем длину текущей цепочки
          maxLength = Math.max(maxLength, currentLength); // Обновляем максимум
        } else {
          currentLength = 0; // Сброс текущей длины, если символ не гласная
        }
      }

      return maxLength; // Возвращаем максимальную длину
    }
  }
}
