package CodewarsVolume2;

public class LargestFiveDigitNumber {
  public static int solve(final String digits) {
    int max = 0; // Переменная для хранения максимального числа

    // Идем по строке, захватывая последовательности длиной 5
    for (int i = 0; i <= digits.length() - 5; i++) {
      // Извлекаем текущую подстроку длиной 5 символов
      String sub = digits.substring(i, i + 5);

      // Преобразуем подстроку в число
      int num = Integer.parseInt(sub);

      // Сравниваем с текущим максимальным и обновляем его при необходимости
      if (num > max) {
        max = num;
      }
    }

    return max; // Возвращаем наибольшее число
  }

  public static void main(String[] args) {
    // Примеры для тестирования
    System.out.println(solve("283910")); // Ожидается: 83910
    System.out.println(solve("1234567890")); // Ожидается: 67890
    System.out.println(solve("9876543210")); // Ожидается: 98765
    System.out.println(solve("0000012345")); // Ожидается: 12345
    System.out.println(solve("123451234512345")); // Ожидается: 54321
  }
}