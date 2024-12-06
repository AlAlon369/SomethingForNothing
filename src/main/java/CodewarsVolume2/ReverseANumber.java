package CodewarsVolume2;

public class ReverseANumber {
  public static void main(String[] args) {
    // Тестовые случаи
    System.out.println(ReverseNumber.reverse(123));   // Ожидается: 321
    System.out.println(ReverseNumber.reverse(-456));  // Ожидается: -654
    System.out.println(ReverseNumber.reverse(1000));  // Ожидается: 1
    System.out.println(ReverseNumber.reverse(0));     // Ожидается: 0
  }

  // План
  // Определить отрицательное число или положительное.
  // Использовать стрингбилдер.
  // Преобразовать в строку
  // Развернуть строку
  // Преобразовать строку в число
  // Если число было отрицательным, сделать результа тотрицательным.
  // Вернуть развернутое число с учетом знака.
  public static class ReverseNumber {
    public static int reverse(int number) {
      // Сохраняем знак числа
      boolean isNegative = number < 0;

      // Преобразуем абсолютное значение числа в строку
      String reversedString = new StringBuilder(String.valueOf(Math.abs(number)))
        .reverse()
        .toString();

      // Преобразуем развернутую строку в число
      int reversedNumber = Integer.parseInt(reversedString);

      // Если число было отрицательным, делаем результат отрицательным
      return isNegative ? -reversedNumber : reversedNumber;
    }
  }
}