package CodewarsVolume2;

public class RoundUpNextMultipleOf5 {

  public static void main(String[] args) {
    // Тестовые примеры
    System.out.println(roundToNext5(0));   // 0
    System.out.println(roundToNext5(2));   // 5
    System.out.println(roundToNext5(3));   // 5
    System.out.println(roundToNext5(12));  // 15
    System.out.println(roundToNext5(21));  // 25
    System.out.println(roundToNext5(30));  // 30
    System.out.println(roundToNext5(-2));  // 0
    System.out.println(roundToNext5(-5));  // -5
  }

  public static int roundToNext5(int number) {
    if (number % 5 == 0) {  // Если число уже кратно 5, возвращаем его.
      return number;
    } else {
      return roundToNext5(number + 1);   // Рекурсия, если число не кратно 5, увеличиваем его на 1 и вызываем метод
    }
  }
}