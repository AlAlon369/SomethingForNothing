package Codewars;

public class kata84 {
    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,2));
        System.out.println(isTriangle(7,2,2));
    }
    // Реализуйте функцию, которая принимает 3 целочисленных значения a, b, c.
    // Функция должна возвращать true, если можно построить треугольник со сторонами заданной длинны.
    // Функция должна возвращать false, в любом другом случае.

    // examples:
    // 1,2,2 - true
    // 7,2,2 - false


    public static boolean isTriangle(int a, int b, int c) {
        if (a < b & a < c & b == c || a + b > c & a + c > b & c + b > a) {
            return true;
        }
        return false;
    }
}
