package Codewars;

public class kata59 {
    public static void main(String[] args) {
        System.out.println(isDivisible(12,4,3));
        System.out.println(isDivisible(3,3,4));
    }

      // метод принимает три аргумента long n, long x, long y
      // Вернуть true если n делится без остатка x и y.
      // Вернуть false, если n делится, но имеет остаток от деления.

      // План
      // если n делится без остатка на x и y, значит оно even.
      // если n делится с остатком на x и y, возвращаем odd



    public static boolean isDivisible(long n, long x, long y) {
        boolean even = true;
        boolean odd = false;
        if (n % x == 0 && n % y == 0) {
            return even;
        }
        if (n % x != 0 && n % y != 0) {
            return odd;
        }
        return false;
    }
}
