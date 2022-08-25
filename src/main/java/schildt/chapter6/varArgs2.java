package schildt.chapter6;

public class varArgs2 {
    // Здесь msg - обычный параметр
    // а v - массив параметров переменной длинны
    static void vaTest (String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest ("Один аргумент в массиве: ", 10);
        vaTest ("Три аргумента в массиве: ", 1, 2, 3);
        vaTest ("Отсутствуют аргументы в виде массива: ");
    }
}
