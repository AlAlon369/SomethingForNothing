package CodewarsVolume2;

import static CodewarsVolume2.InterlokingBinaryPairs.Kata.interlockable;

public class InterlokingBinaryPairs {
  public static void main(String[] args) {
    // Примеры тестов
    System.out.println(interlockable(9, 4)); // Ожидается true (1001 & 0100 = 0000)
    System.out.println(interlockable(3, 6)); // Ожидается false (0011 & 0110 = 0010)
    System.out.println(interlockable(0, 7)); // Ожидается true (0000 & 0111 = 0000)
    System.out.println(interlockable(5, 10)); // Ожидается true (0101 & 1010 = 0000)
    System.out.println(interlockable(15, 15)); // Ожидается false (1111 & 1111 = 1111)
  }
  // План
  // У нас есть два числа типа лонг
  // Нужно перевести числа в двоичное представление
  // Проверить побитово, чтобы на всех позициях, где одно число имеет 1, другое число имело 0.
  // Побитовое "И" (&) между числами возвращает число, где биты устанавливаются в 1, если соответствующие биты обоих чисел
  // равны 1. Например:
  // 9 & 4 (1001 & 0100) возвращает 0000, значит они не пересекаются.
  // 3 & 6 (11 & 110) возвращает 10, значит пересекаются.

  // Использовать побитовую операцию &.
  // Проверить, равен ли результат a & b нулю (0).
  // Вернуть true, если результат равен нулю, иначе вернуть false.
  public class Kata {
    public static boolean interlockable(long a, long b) {
      return (a & b) == 0;
    }
  }
}
