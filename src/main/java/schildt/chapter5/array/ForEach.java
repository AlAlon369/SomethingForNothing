package schildt.chapter5.array;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Использование цикла типа for-each для суммирования и отображения значений.
        for (int x : nums)   {         // Цикл типа for-each
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum);



    }
}
