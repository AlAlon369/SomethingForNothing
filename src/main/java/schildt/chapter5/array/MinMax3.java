package schildt.chapter5.array;

public class MinMax3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int min, max;

        numbers[0] = 99;
        numbers[1] = -10;
        numbers[2] = 100123;
        numbers[3] = 18;
        numbers[4] = -978;
        numbers[5] = 5623;
        numbers[6] = 463;
        numbers[7] = -9;
        numbers[8] = 287;
        numbers[9] = 49;

        min = max = numbers[0];
        for (int itVar : numbers)
        {
            if (itVar < min) min = itVar;
            if (itVar > max) max = itVar;
        }
        System.out.println("min и max: " + min + " " + max);
    }
}



