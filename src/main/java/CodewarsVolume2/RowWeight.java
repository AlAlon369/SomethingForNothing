package CodewarsVolume2;

import java.util.Arrays;

public class RowWeight {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.rowWeights(new int[]{80})));
    System.out.println(Arrays.toString(Solution.rowWeights(new int[]{39,84,74,18,59,72,35,61})));
    System.out.println(Arrays.toString(Solution.rowWeights(new int[]{100,51,50,100})));

  }

  // План
  // Нужно разделить элементы входного массива weights на две команды
  // Все элементы массива (индексы) нечетные - записываем в 1-ую команду, четные - во вторую
  // Считаем сумму элементов для обеих команд
  // Возвращаем результат ввиде массива двух чисел.

  // Реализация
  // Создаем две переменных team1, team 2, для хранения сумм веса команд
  // Бежим по циклу for, используя остаток отделения.
  // Если индекс % 2 == 0 — элемент относится ко второй команде.
  // Если индекс % 2 != 0 — элемент относится к первой команде.
  // Обновляем значение переменных team1 и team2
  // Создаем массив, в котором у нас team1 и team2, возвращаем его.

  public class Solution {
    public static int[] rowWeights(final int[] weights) {
      // Инициализируем суммы для обеих команд
      int team1 = 0;
      int team2 = 0;

      // Перебираем элементы массива с их индексами
      for (int i = 0; i < weights.length; i++) {
        if (i % 2 == 0) {
          // Четный индекс — добавляем к сумме команды 1
          team1 += weights[i];
        } else {
          // Нечетный индекс — добавляем к сумме команды 2
          team2 += weights[i];
        }
      }
      // Возвращаем результат в виде массива
      return new int[] {team1, team2};
    }
  }
}
