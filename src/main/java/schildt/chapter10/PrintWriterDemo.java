package schildt.chapter10;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);   // Создание класса PrintWriter, связанного
        // с потоком System.Out
        int i = 10;
        double d = 123.65;

        pw.println("Использование класса PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i + d));
    }
}
