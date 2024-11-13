package CodewarsVolume2;

public class FindTheStrayNumber {
  public static void main(String[] args) {
    // Пример вызова метода stray и вывода результата
    System.out.println(Solution.stray(new int[]{1, 1, 2})); // Ожидается 2
    System.out.println(Solution.stray(new int[]{17, 17, 3, 17, 17, 17, 17})); // Ожидается 3
  }

   class Solution {
    static int stray(int[] numbers) {
      int first = numbers[0]; // Предполагаем, что первое число — уникальное
      int second = numbers[1]; // Проверяем уникально ли второе число (сравниваем)

      // Если первое и второе числа разные, проверяем третье для точного определения
      if (first != second) {
        // Можно использовать тернарный оператор, пока сложно.
        if (numbers[2] == first) {
          return second;
        } else {
          return first;
        }
      }

      // Если первые два числа равны, ищем число, отличное от них
      for (int i = 2; i < numbers.length; i++) {
        if (numbers[i] != first) {
          return numbers[i];
        }
      }
      return first; // В случае, если не нашли ничего нового, возвращаем первое
    }
  }
}