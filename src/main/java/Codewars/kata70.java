package Codewars;

public class kata70 {
    public static void main(String[] args) {
        System.out.println(Digits(1));
        System.out.println(Digits(5));
        System.out.println(Digits(10));
    }
      // Определить общее количество цифр в целом числе (n >= 0) данном в качестве входных данных для функции.
      // Например, 9 - это одна цифра, 66 - 2 цифры, а 128685 - 6 цифр. Будьте осторожны, чтобы избежать переполнения/недостаточного заполнения

      // План








    public static int Digits(long n) {
        String number = String.valueOf(n);
        int length = number.length();
        return length;
    }
}
