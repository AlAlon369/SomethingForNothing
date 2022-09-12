package Codewars;

public class kata79 {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4));
        System.out.println(numberOfDivisors(5));
        System.out.println(numberOfDivisors(12));
        System.out.println(numberOfDivisors(30));
    }

    // Дано число n.
    // Нужно подсчитать количество делителей натурального числа n.
    // Случайные тесты доходят до n = 500000.



    public static long numberOfDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0)
                count++;
        }


        return count;
    }
}
