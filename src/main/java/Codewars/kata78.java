package Codewars;

public class kata78 {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(42));
    }

     // Дан треугольник последовательных нечетных чисел
     // Вычислите сумму чисел в каждом ряде треугольника (числа n) стартуя с индекса 1, 2, 3, 4, 5 и т.д. (ряда)

     // План
     // Создание переменной, которая будет хранить в себе сумму чисел (ряда) треугольника
     // Math.paw op.


    public static int rowSumOddNumbers(int n) {
        return (int) Math.pow(n, 3);
    }
}
