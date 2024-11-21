package CodewarsVolume2;

public class SplitStringIntoParts {

  public static void main(String[] args) {
    // Тестируем метод splitInParts
    String input = "supercalifragilisticexpialidocious";
    int partLength = 3;

    // Вызываем метод и выводим результат
    System.out.println(splitInParts(input, partLength));
    // Ожидаемый результат: "sup erc ali fra gil ist ice xpi ali doc iou s"
  }

  public static String splitInParts(String s, int partLength) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i += partLength) {
      // Проверяем конец строки, чтобы не выйти за пределы
      int end = Math.min(i + partLength, s.length());
      result.append(s.substring(i, end));

      // Добавляем пробел, если это не последний кусок
      if (end < s.length()) {
        result.append(" ");
      }
    }

    return result.toString();
  }
}