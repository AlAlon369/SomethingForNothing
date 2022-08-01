package schildt.chapter6;

public class QDemo2 {
    public static void main(String[] args) {
        // Создание пустой очереди для хранения 10 элементов
        Queue2 q1 = new Queue2(10);           // очередь q1

        char name[] = {'T', 'o', 'm'};
        // Создание очереди на основе массива
        Queue2 q2 = new Queue2(name);             // очередь q2

        char ch;
        int i;

        // Помещение ряда символов в очередь q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }
        // Создание одной очереди на основе другой.
        Queue2 q3 = new Queue2(q1);

        // Отображение очередей
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

            System.out.println("\n");

            System.out.print("Содержимое q2: ");
            for (i = 0; i < 3; i++) {
                ch = q2.get();
                System.out.print(ch);
            }

            System.out.println("\n");

            System.out.print("Содержимое q3: ");
            for (i = 0; i < 10; i++) {
                ch = q3.get();
                System.out.print(ch);
        }
    }
}