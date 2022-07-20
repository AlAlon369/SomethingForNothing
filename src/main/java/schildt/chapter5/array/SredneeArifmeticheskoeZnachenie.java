package schildt.chapter5.array;

public class SredneeArifmeticheskoeZnachenie {
    public static void main(String[] args) {
        double numbers[] = new double [10];
        numbers[0] = 1.5;
        numbers[1] = 2.7;
        numbers[2] = 3.3;
        numbers[3] = 4.5;
        numbers[4] = 5.4;
        numbers[5] = 6.2;
        numbers[6] = 7.25;
        numbers[7] = 8.1;
        numbers[8] = 9.5;
        numbers[9] = 10.2;

        double summa = 0;

        for (int i = 0; i < numbers.length; i++) {
            summa += numbers[i];

            System.out.println("Среднее арифметическое значение: " + summa / numbers.length);
        }




    }
}
