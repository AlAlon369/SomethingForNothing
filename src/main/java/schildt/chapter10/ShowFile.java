package schildt.chapter10;
/* При вызове этой программы следует указать имя файла, содержимое которого требуется посмотреть.
Например, для файла на экран содержимого файла TEST.TXT необходимо ввести в командной строке
следующую команду:
     java ShowFile TEST.TXT
 */

import java.io.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ShowFile {
    public static void main(String[] args)
    {
        int i;
        FileInputStream fin;
        // Сначала нужно убедиться в том, что программе передается имя файла.
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);   //   <-- Открытие файла
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            // Чтение байтов, пока не встретится символ EOF
            do {
                i = fin.read();   // <--   Cчитывание данных из файла
                if (i != -1) System.out.print((char) i);
                } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла");
        }
        try {
            fin.close();   // Закрытие файла
        } catch (IOException exc) {
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
