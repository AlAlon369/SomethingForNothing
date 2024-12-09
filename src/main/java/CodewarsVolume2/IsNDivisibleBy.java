package CodewarsVolume2;

import java.util.Arrays;

public class IsNDivisibleBy {
  public static void main(String[] args) {
    // Примеры вызовов метода isDivisible
    System.out.println(Divisible.isDivisible(6, 1, 3)); // true
    System.out.println(Divisible.isDivisible(12, 3, 4)); // true
    System.out.println(Divisible.isDivisible(100, 5, 4, 10, 25, 20)); // true
    System.out.println(Divisible.isDivisible(12, 7)); // false

    // Проверка метода с массивом
    int[] divisorsArray = {100, 5, 4, 10, 25, 20};
    System.out.println(Divisible.isDivisible(divisorsArray)); // true

    int[] divisorsArrayFail = {12, 7};
    System.out.println(Divisible.isDivisible(divisorsArrayFail)); // false
  }

  // План
  // Нам нужно модифицировать функцию, в которой нам необходимо проверить, можем ли мы разделить первый аргумент n c аргументами
  // которые приходят в divisors.
  // Каждый делитель из переданных аргументов должен делить n без остатка (n % делитель == 0).
  // Для реализации можно использовать varargs (переменное количество аргументов в методе).
  // Метод будет объявлен как isDivisible(int n, int... divisors).

  // Проверить, есть ли дополнительные аргументы (если их нет, сразу вернуть true).
  // Пройтись по массиву divisors:
  // Для каждого элемента проверить, делится ли n на этот элемент.
  // Если хотя бы один делитель не подходит, вернуть false.
  // Если все проверки прошли, вернуть true.

  public class Divisible {
    public static boolean isDivisible(int n, int... divisors) {
      for (int divisor : divisors) {
        if (divisor == 0 || n % divisor != 0) {
          return false;
        }
      }
      return true;
    }
    public static boolean isDivisible(int[] args) {
      return isDivisible(args[0], Arrays.copyOfRange(args, 1, args.length));
    }
  }
}
