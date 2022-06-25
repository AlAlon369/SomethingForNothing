package Others;

public class kata17 {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2}));
        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5,-3,4}));
        System.out.println(squareSum(new int[] {}));

    }

    // К нам приходит массив интеджеров.
    // Нужно завершить функцию квадратной суммы, чтобы каждое переданное число (интеджер, из массива)
    // возводилось в квадрат, а потом суммировалось.

    public static int squareSum(int[] n) {
        int sum = 0;                               // сумма равно 0
        for (int i = 0; i < n.length; i++) {       // n.leтght цикл фор пробегаясь по массиву инкрементирует i
            sum +=n[i] * n[i];                     // возводим n[i] в квадратную степень, суммируем интеджеры в массиве n
        }
    return sum;
}
}
