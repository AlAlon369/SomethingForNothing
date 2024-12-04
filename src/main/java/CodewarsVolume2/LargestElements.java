package CodewarsVolume2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LargestElements {
  public static void main(String[] args) {
    int[] result = Solution.largest(2, new int[]{7, 6, 5, 4, 3, 2, 1});
    System.out.println(Arrays.toString(result)); // Ожидается: [6, 7]
  }

  // План
  // Проверить входные данные массива
  // Использование структуры данных для поиска максимальных элементов
  // Приоритетная очередь (PriorityQueue): Использовать PriorityQueue с фиксированным размером n, чтобы хранить только n самых
  // больших элементов.
  // Добавить элементы в очередь, поддерживая размер n.

  // Извлечение и форматирование результата
  // Извлечь элементы из очереди. В PriorityQueue они не будут отсортированы. Если требуется сортировка, отсортировать результат.
  // Вернуть массив.

  // Убедиться, что алгоритм имеет приемлемую временную сложность:
  // Вставка в PriorityQueue — O(log n).
  // Для массива длиной m, общий процесс — O(m log n).
  public static class Solution {

    public static int[] largest(int n, int[] arr) {
      // Если n == 0, возвращаем пустой массив
      if (n == 0) {
        return new int[]{};
      }
      // Если n >= длины массива, возвращаем массив целиком, отсортированный
      if (n >= arr.length) {
        Arrays.sort(arr);
        return arr;
      }

      // Используем PriorityQueue для нахождения n наибольших элементов
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      // Наполняем очередь
      for (int num : arr) {
        if (minHeap.size() < n) {
          minHeap.offer(num); // Добавляем элемент, если размер очереди меньше n
        } else if (num > minHeap.peek()) {
          minHeap.poll();     // Удаляем минимальный элемент
          minHeap.offer(num); // Добавляем текущий элемент
        }
      }

      // Преобразуем очередь в массив
      int[] result = new int[n];
      int index = 0;
      for (int num : minHeap) {
        result[index++] = num;
      }

      // Сортируем результат, если требуется порядок
      Arrays.sort(result);

      return result;
    }
  }
}