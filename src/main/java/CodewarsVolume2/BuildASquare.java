package CodewarsVolume2;

public class BuildASquare {
  public static void main(String[] args) {
    // Пример: вызов метода с n = 5
    System.out.println(Kata.generateShape(5));
  }

  // План
  // Требуется создать строку, представляющую квадрат из символов +.
  // Размер квадрата (длина и ширина) соответствует переданному числу n.
  // Создать строку с длиной n, содержащую только символы +.
  // Повторить эту строку n раз, добавляя перенос строки n между строками.
  public class Kata {
    public static final String generateShape(int n) {
                                                                // concat("\n") — добавляет перенос строки для формирования
      // строки с разделителем.                                 // // String.repeat(n) — позволяет повторить строку n раз.
      // Создаём одну строку длиной n из символов '+'
      String row = "+".repeat(n);

      // Повторяем эту строку n раз с разделением '\n'
      return row.concat("\n").repeat(n).stripTrailing();    // stripTrailing() — убирает последний лишний символ переноса строки.
    }
  }
}