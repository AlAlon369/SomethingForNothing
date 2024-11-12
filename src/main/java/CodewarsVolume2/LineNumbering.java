package CodewarsVolume2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {

  // Приватный конструктор предотвращает создание экземпляров класса
  private LineNumbering() {
    throw new UnsupportedOperationException("Utility class");
  }

  public static List<String> number(List<String> lines) {
    List<String> result = new ArrayList<>();  // создаем новый список result

    for (int i = 0; i < lines.size(); i++) {
      result.add((i + 1) + ": " + lines.get(i));   // добавляем к i + 1 чтобы порядковый номер начинался с 1
    }                                              // используем конкатенацию строк, чтобы получить нужный формат

    return result;
  }

  // Метод main для запуска и проверки работы метода number
  public static void main(String[] args) {
    List<String> example1 = Arrays.asList("a", "b", "c");
    List<String> example2 = Arrays.asList("", "", "", "", "");
    List<String> example3 = new ArrayList<>();

    System.out.println("Example 1: " + number(example1));
    System.out.println("Example 2: " + number(example2));
    System.out.println("Example 3: " + number(example3));
  }
}