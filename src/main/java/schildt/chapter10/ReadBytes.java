package schildt.chapter10;

// Чтение байтов с клавиатуры в массив
import java.io.*;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];

        System.out.println("Введите символы.");
        System.in.read(data);
        System.out.print("Вы ввели: ");
        for (int i = 0; i < data.length; i++)
            System.out.println((char) data[i]);
    }
}
