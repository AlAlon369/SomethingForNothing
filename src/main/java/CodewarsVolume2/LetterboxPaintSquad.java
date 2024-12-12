package CodewarsVolume2;

public class LetterboxPaintSquad {
  public static void main(String[] args) {
    int[] result = paintLetterboxes(125, 132);
    for (int count : result) {
      System.out.print(count + " ");
    }
    // Ожидаемый результат: 1 9 6 3 0 1 1 1 1 1
  }

  // План
  // Инициализация массива частот:
  // Создайте массив длиной 10, где каждая позиция соответствует цифре (0–9) и инициализируется нулями.
  // Перебор диапазона чисел:
  // Пройдите через все числа от start до end включительно.
  // Для каждого числа выделите его цифры.
  // Обновление частот:
  // Для каждой цифры увеличьте соответствующий элемент массива частот.
  // Возврат результата:
  // После завершения цикла верните массив с подсчитанными частотами.

  public static int[] paintLetterboxes(final int start, final int end) {
    // Инициализация массива для частот цифр
    int[] frequencies = new int[10];

    // Перебираем числа от start до end
    for (int i = start; i <= end; i++) {
      // Разбиваем число на цифры
      int number = i;
      while (number > 0) {
        int digit = number % 10; // Получаем последнюю цифру
        frequencies[digit]++;    // Увеличиваем частоту
        number /= 10;           // Удаляем последнюю цифру
      }
    }

    return frequencies; // Возвращаем массив частот
  }
}