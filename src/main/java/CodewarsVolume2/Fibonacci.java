package CodewarsVolume2;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("fib(1) = " + fib(1)); // Ожидается: 1
    System.out.println("fib(2) = " + fib(2)); // Ожидается: 1
    System.out.println("fib(3) = " + fib(3)); // Ожидается: 2
    System.out.println("fib(4) = " + fib(4)); // Ожидается: 3
    System.out.println("fib(5) = " + fib(5)); // Ожидается: 5
    System.out.println("fib(6) = " + fib(6)); // Ожидается: 8
  }

  // План
  // Создать рекурсивный метод fib.
  // Реализовать базовый случай, чтобы вернуть n, если n <= 1
  // Написать рекурсивное вычисление для F (n - 1) + F (n - 2)

  public static long fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
