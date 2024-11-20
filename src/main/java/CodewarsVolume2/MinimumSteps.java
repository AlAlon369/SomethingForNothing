package CodewarsVolume2;

import java.util.Arrays;

public class MinimumSteps {
  public static void main(String[] args) {
    // Тестовые примеры
    System.out.println(Kata.minimumSteps(new int[]{1, 10, 12, 9, 2, 3}, 6)); // Output: 2
    System.out.println(Kata.minimumSteps(new int[]{8, 9, 4, 2}, 23));       // Output: 3
    System.out.println(Kata.minimumSteps(new int[]{19, 98, 69, 28, 75, 45, 17, 98, 67}, 464)); // Output: 8
  }

  public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
      // Сортируем массив по возрастанию
      Arrays.sort(numbers);

      int sum = 0;
      int steps = 0;

      // Проходим по отсортированному массиву, пока сумма не станет >= k
      for (int number : numbers) {
        sum += number;
        if (sum >= k) {
          break;
        }
        steps++;
      }

      return steps;
    }
  }
}