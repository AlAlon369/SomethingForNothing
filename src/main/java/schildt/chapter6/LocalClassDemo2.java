package schildt.chapter6;

public class LocalClassDemo2 {
    public static void main(String[] args) {
        // Внутренняя версия класса ShowBits
        class ShowBits2 {              // <---- локальный класс вложенный в метод
            int numbits;

            ShowBits2 (int n) {
                numbits = n;
            }

            void show (long val) {
                long mask = 1;

                // Сдвиг влево для установки еденицы в нужной позиции
                mask <<= numbits -1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");

                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (byte b = 0; b < 10; b++) {
            ShowBits2 byteval = new ShowBits2(8);

            System.out.print(b + " в двоичном представлении: ");
            byteval.show(b);
        }
    }
}
