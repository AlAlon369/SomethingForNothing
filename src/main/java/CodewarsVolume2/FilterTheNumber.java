package CodewarsVolume2;

public class FilterTheNumber {
  public static void main(String[] args) {
    System.out.println(Kata.filterString("a1b2c3")); // Ожидаемый результат: 123
    System.out.println(Kata.filterString("abc"));    // Ожидаемый результат: 0 (или другой результат, если уточнено)
    System.out.println(Kata.filterString("123"));    // Ожидаемый результат: 123
    System.out.println(Kata.filterString("a0b1c2")); // Ожидаемый результат: 012
  }

  // План:
  // Нам дана стринга, необходимо извлечь ищ неё все числа.
  // С регулярками я слаб, найти способ, как можно пройтись по строке и извлечь только цифры.
  // После того как мы извлечем цифры, нам нужно их объеденить в строку.
  // На выходе преобразовать строку в цифрами в число.

  public class Kata {
    public static long filterString(final String value) {
      StringBuilder result = new StringBuilder();

      // Перебираем каждый символ в строке
      for (char c : value.toCharArray()) {
        // Проверяем, является ли символ цифрой
        if (Character.isDigit(c)) {
          result.append(c); // Если цифра, добавляем к результату
        }
      }

      // Если цифры не найдены, возвращаем 0
      if (result.length() == 0) {
        return 0L;
      }

      return Long.parseLong(result.toString());
    }
  }
}