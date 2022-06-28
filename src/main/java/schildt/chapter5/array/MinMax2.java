package schildt.chapter5.array;

public class MinMax2 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 10, -978, 5623, 436, -9, 49};   // инициализаторы массива
        int min, max;

        min = max = nums[0];
        for (int i = 1; 1 < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

            System.out.println("min и max: " + min + " " + max);
        }
    }
}
     class ArrayErr {
         public static void main(String[] args) {
             int sample [] = new  int [10];
             int i;

             // Имитация выхода индекса за пределы массива
             for (i = 0; i < 100; i = i +1)
                 sample[i] = i;
         }
     }
