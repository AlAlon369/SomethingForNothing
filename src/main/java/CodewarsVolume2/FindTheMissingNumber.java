package CodewarsVolume2;

public class FindTheMissingNumber {
  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10}; // пример массива с пропущенным числом 7
    System.out.println(Kata.missingNo(nums)); // Ожидается вывод: 7
  }

  // План
  // Нам дан массив целых чисел, от 0 до 100, но один элемент отсутствует.
  // нужно определить какой элемент отсутствует.
  // Временная сложность О(n) линейная, так как массив нужно обойти полностью.
  // Использование суммы арифметической прогрессии:
  // Для чисел  от 0 до 100 имеет сумму S = n(n+1) / 2, где n = 100.
  // Использовать цикл, сумма О(n) по времени, O(1) по памяти.
  // Вернуть результат.

  public static class Kata {
    public static int missingNo(int[] nums) {
      // Найти сумму чисел от 0 до 100
      int expectedSum = 100 * (100 + 1) / 2;
      // Найти сумму элементов массива
      int actualSum = 0;
      for (int num : nums) {
        actualSum += num;
      }
      // Разница между ожидаемой суммой и фактической - пропущенное число
      return expectedSum - actualSum;
    }
  }
}
