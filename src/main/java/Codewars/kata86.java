package Codewars;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class kata86 {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(9));
        System.out.println(seriesSum(15));
    }
    // Написать функцию, которая возвращает сумму следующих рядов числа n-го числа (параметра)
    // Example: Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
    // Вам нужно округлить ответ до 2-ух знаков после запятой и вернуть его как строку.
    // Если заданное значение равно  0, оно должно вернуть 0.00.
    // В качестве аргументов вам будут предоставлены только натуральные числа.

    // План
    // Если число n которое к нам приходит равно 0, то мы возвращаем 0.00
    //


    public static String seriesSum(int n) {
        double summa = 0.0;
        //   if (n == 0) {
        //       return String.valueOf(summa);
        //   } else {
        for (int i = 1; i <= n * 3; i += 3) {
            summa += 1.0 / i;
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(summa);
        BigDecimal rounded = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return rounded.toString();
    }
}
