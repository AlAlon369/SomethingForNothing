package Codewars;

public class kata83 {
    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
        System.out.println(nbDig(11011, 2));
        System.out.println(nbDig(12224, 8));
        System.out.println(nbDig(11549, 1));
    }

    // Возьмите целое число n (n >= 0), и цифру d (0 <= d <= 9) как целое число.
    // Возведите в квадрат все числа k (0 <= k <= n) от 0 до n
    // Подсчитайте количество цифр, d использованных при написании всех k**2
    // Вызовите nb_dig (или nbDig) функцию принимающую n и b в качестве параметров и возвращаущую это количество

    // План
    // Пробежаться по циклу, где n >= 0 и (((digit d (0 <= d <= 9)))) <<- KAK?
    // Возвесьти в квадрат все числа, где k (0 <= k <= n) между 0 и n
    // Посчитать digits (d) в числах, которые мы возвели в квадрат


    public static int nbDig(int n, int d) {
        int sumOfDNumbers = 0;
        for (int i = 0; i <= n; i++) {
            int numberInSquare = (int) Math.pow(i, 2);
            sumOfDNumbers += countOfD(numberInSquare, d);
        }
        return sumOfDNumbers;
    }

    public static int countOfD(int n, int d) {
        int count = 0;
        do {
            if (n % 10 == d) {
                count++;
            }
            n /= 10;
        } while (n > 0);
        return count;
    }
}

