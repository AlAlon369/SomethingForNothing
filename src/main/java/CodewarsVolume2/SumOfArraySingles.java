package CodewarsVolume2;

import static CodewarsVolume2.SumOfArraySingles.Solution.repeats;

import java.util.HashMap;

public class SumOfArraySingles {
  public static void main(String[] args) {
    // Пример входных данных
    int[] input = {4, 5, 7, 5, 4, 8};

    // Вызываем метод repeats и выводим результат
    System.out.println(repeats(input)); // Ожидается: 15
  }

  // План
  // Использование структуры данных для подсчёта частот:
  // Применить структуру данных, которая позволяет хранить элементы и их количество (например, HashMap или TreeMap).
  // Пройти по массиву и подсчитать, сколько раз каждый элемент встречается.
  // Если элемент встречается впервые, добавить его в Map с количеством 1.
  // Если элемент уже есть в Map, увеличить его счётчик.

  // Фильтрация уникальных элементов: После подсчёта частот пройти по ключам Map и выбрать только те, которые встречаются ровно
  // один раз.
  // Подсчёт суммы уникальных элементов: Просуммировать только те числа, которые встречаются ровно один раз (значение счётчика
  // равно 1).

  // Проверка для особых случаев:
  // Если массив пустой, вернуть 0.
  // Если нет элементов, которые встречаются ровно один раз, также вернуть 0.
  // Оптимизация:
  // Вместо Map можно использовать Set для хранения элементов, которые встречаются один раз, и ещё один Set для элементов,
  // которые повторяются.
  // В процессе прохода по массиву:
  // Если элемент ещё не встречался, добавить его в первый Set.
  // Если элемент уже есть в первом Set, переместить его во второй Set.
  // В конце сумма всех элементов из первого Set даст результат.

  class Solution {
    public static int repeats(int[] arr) {
      // Создаем HashMap для подсчёта частот элементов
      HashMap<Integer, Integer> frequencyMap = new HashMap<>();

      // Проходим по массиву и заполняем карту
      for (int num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      }

      // Суммируем элементы, которые встречаются ровно один раз
      int sum = 0;
      for (int key : frequencyMap.keySet()) {
        if (frequencyMap.get(key) == 1) {
          sum += key;
        }
      }
      return sum;
    }
  }
}