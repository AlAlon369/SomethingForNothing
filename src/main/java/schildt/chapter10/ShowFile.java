package schildt.chapter10;
/* При вызове этой программы следует указать имя файла, содержимое которого требуется посмотреть.
Например, для файла на экран содержимого файла TEST.TXT необходимо ввести в командной строке
следующую команду:
     java ShowFile TEST.TXT
 */

import java.io.*;

import java.io.FileInputStream;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;

        // Прежде всего необходимо убедиться в том, что программе передаются имена обоих файлов

        if (args.length != 2) {
            System.out.println("Использование: CopyFile - источник и назначение ");
            return;
        }

        // Открытие двух файлов и управление ими с помощью инструкции try

        try (FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }
    }



