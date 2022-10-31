package schildt.chapter10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
      int i = 10;
      double d = 1023.56;
      boolean b = true;

      // Запись ряда значений
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Запись: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Записано " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch (IOException exc) {
            System.out.println("Ошибка при записи");
            return;
        }

        System.out.println();
    }
}
