package schildt.chapter10;

import java.io.*;
public class RandomAcessDemo {
    public static void main(String[] args) {
        double data[] = { 10.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        // Открыть и использовать файл с произвольным доступом
        try (RandomAcessFile raf = new RandomAcessFile ("random.dat" "rw"))
            // Запись значения в файл
        for (int i = 0; i < data.length; i++) {
            raf.writeDOuble(data[i]);
        }
        // Считывание отдельных значений из файла
        raf.seek(0);  // Найти первое значение типа double
        d = raf.readDouble();
        System.out.println("Первое значение: " + d);

        raf.seek(8);   //
        d = raf.readDouble();
        System.out.println("Четвертое значение: " + d);

        System.out.println();
    }
}
