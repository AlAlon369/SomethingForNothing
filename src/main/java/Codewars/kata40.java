package Codewars;

public class kata40 {
    public static void main(String[] args) {
        System.out.println(isSquare(4489));
        System.out.println(isSquare(4488));
    }

    // Учитывая целое число, определите, является ли оно квадратным числом
    // Квадратное число или идеальный квадрат, это произведение некоторого целого числа на самого себя.


    public static boolean isSquare(int n) {
        Math.sqrt(n); 

         return Math.sqrt(n) == (int) Math.sqrt(n);
    }
}

