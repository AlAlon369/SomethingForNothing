package CodewarsVolume2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FormTheMinimuum {
  public static void main(String[] args) {
    System.out.println(Minimum.minValue(new int[]{1, 3, 1}));
    System.out.println(Minimum.minValue(new int[]{4, 7, 5, 7}));
  }

  // План
  // Нам дан массив, где нам нужно вернуть минимальное значение (число), игнорирую дубликаты.
  // Удалить дубликаты из массива.
  // Произвести сортировку оставшихся элементов. (В порядке возростания)
  // преобразовать отсортированные цисла в строку, затем преобразовать в число.
  // Конкатенировать цифры из отсортированного списка или массива для формирования итогового числа.

  public static class Minimum {
    public static int minValue(int[] values) {
      // убираем дубликаты
      Set<Integer> uniqueValues = Arrays.stream(values).boxed().collect(Collectors.toSet());
      // 2. Сортируем уникальные числа
      int[] sortedValues = uniqueValues.stream().sorted().mapToInt(i -> i).toArray();
      // Получаем число
      StringBuilder result = new StringBuilder();
      for (int num : sortedValues) {
        result.append(num);
      }
      // Преобразуем результат в числовое значение
      return Integer.parseInt(result.toString());
    }
  }
}
