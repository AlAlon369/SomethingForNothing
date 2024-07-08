package schildt.chapter10;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;

        // Прежде всего необходимо убедиться в том, что программе передаются имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CopyFile - источник и назначение ");
            return;
        }

        // Открытие двух файлов и управление ими с помощью инструкции try

        try (FileInputStream fin = new FileInputStream(args[0]);   // Управление двумя ресурсами
        FileOutputStream fout = new FileOutputStream(args[1]))     // Управление двумя ресурсами
             {
            do
                 {
                     i = fin.read();
                     if (i != -1) fout.write(i);
                 } while(i !=-1);
             } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
