package CodewarsVolume2;

public class SumOfCubes {
  public static void main(String[] args) {
    // Примеры вызова метода и проверки результата
    System.out.println(Solution.sumCubes(2)); // Ожидаемый результат: 9
    System.out.println(Solution.sumCubes(3)); // Ожидаемый результат: 36
    System.out.println(Solution.sumCubes(4)); // Ожидаемый результат: 100
  }

  // План:
  // Создаем переменную которая будет содержать сумму.
  // В цикле мы бежим от 1 до n включительно, получая значение и добавляя его к общей сумме
  public static class Solution {
    public static long sumCubes(long n) {
      long sum = 0; // Инициализация суммы
      for (long i = 1; i <= n; i++) { // Цикл от 1 до n включительно
        sum += i * i * i; // Вычисляем куб текущего числа и добавляем к сумме
      }
      return sum; // Возвращаем итоговую сумму кубов
    }
  }
}
