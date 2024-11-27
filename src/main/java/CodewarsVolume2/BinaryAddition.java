package CodewarsVolume2;

public class BinaryAddition {
  public static void main(String[] args) {
    System.out.println(Kata.binaryAddition(1, 1)); // "10"
    System.out.println(Kata.binaryAddition(5, 9)); // "1110"
  }

  public class Kata {

    public static String binaryAddition(int a, int b) {
      // Суммируем два числа
      int sum = a + b;
      // Преобразуем сумму в двоичную строку
      return Integer.toBinaryString(sum);       //  Этот метод преобразует целое число в строку, представляющую его двоичное представление.
    }
  }
}