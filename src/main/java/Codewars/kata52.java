package Codewars;

public class kata52 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{-1,2,3,4,-5}));
    }
    // Имеет массив чисел, нужно возвратить сумму всех положительных.
    // Если суммировать нечего, сумма по умолчанию 0.

    // План
    // В цикле fori пробежаться по массиву.
    // в теле цикла если элемент массива не отрицательный, прибавить его к сумме.
    // return int sum

    public static int sum(int[] arr) {
        int summa = 0;
        for (int j : arr) {
            if (j >= 0) {
                summa += j;
            }
        }
        return summa;
    }
}
