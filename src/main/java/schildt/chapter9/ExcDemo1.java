package schildt.chapter9;

// Демонстрация обработки исключений
public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try { // создание блока try
            System.out.println("Эта строка не будет отображаться");

            nums[7] = 10;   // Попытка выйти за пределы массива nums
            System.out.println("Эта строка не будет отображаться");
        }
        catch (ArrayIndexOutOfBoundsException exc) {   // Перехват ошибок, вызываемых выходом за пределы массива
            System.out.println("Выход за пределы массива!");
        }
        System.out.println("После инструкции catch");
    }
}
