package CodewarsVolume2;

import static CodewarsVolume2.SeachForLetter.Letters.search;

public class SeachForLetter {
  public static void main(String[] args) {
    System.out.println(search("a   **&  cZ")); // Ожидается: "10100000000000000000000001"
    System.out.println(search("aaaaaaa79345675")); // Ожидается: "10000000000000000000000000"
    System.out.println(search("&%#*")); // Ожидается: "00000000000000000000000000"
  }

  // План
  // Инициализация строки результата:
  // Создайте строку длиной 26, состоящую из символов '0'. Она будет представлять буквы алфавита, начиная с 'a' (позиция 0) до
  // 'z' (позиция 25).
  // Обработка входной строки:
  // Пройдите через каждый символ строки line, игнорируя регистр.
  // Определите, является ли символ буквой английского алфавита. Если да, вычислите его позицию в алфавите (например, 'a' → 0,
  // 'b' → 1, ..., 'z' → 25).
  // Обновление результата:
  // Если позиция для буквы уже найдена (например, 'a' → первая позиция), измените соответствующий символ в строке результата с
  // '0' на '1'.
  // В конце преобразуйте строку результата в финальный вид и везвращаем её.

  public class Letters {
    public static String search(String line) {
      // Инициализация массива для хранения результатов
      char[] result = new char[26];
      // Заполняем массив символами '0'
      for (int i = 0; i < 26; i++) {
        result[i] = '0';
      }

      // Проходим по каждому символу строки
      for (char c : line.toLowerCase().toCharArray()) {
        // Проверяем, является ли символ буквой
        if (c >= 'a' && c <= 'z') {
          // Вычисляем позицию символа в алфавите
          int position = c - 'a';
          // Устанавливаем соответствующий элемент массива в '1'
          result[position] = '1';
        }
      }

      // Преобразуем массив обратно в строку и возвращаем
      return new String(result);
    }
  }
}
