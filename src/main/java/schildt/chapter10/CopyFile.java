package schildt.chapter10;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i = 0;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Сначала нужно убедиться в том, что программе передаются имена обоих файлов

        if (args.length != 2) {
            System.out.println("Испольозование: CopyFile - источник и назначение");
            return;
        }

        // Копирование файла
        try {
            // Попытка открытие файла
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[i]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: + exc");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }
}
