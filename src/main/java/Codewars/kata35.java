package Codewars;



public class kata35 {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(0));
    }

    // Нужно возвести каждую цифру числа (нам приходит int n) в квадратную степень, и сложить их.
    // int n принимает целое число и возвращает целое число.

    // 1. из int n нужно сделать массив чисел int[]
    // 2.
    // 3.
    // 4.
    // 5.

    public static int squareDigits(int n) {
        char[] numbers = ("" + n).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char number : numbers) {
            int x = Character.getNumericValue(number);
            stringBuilder.append(x * x);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
