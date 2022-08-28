package schildt.chapter6;

public class varArgs4 {
    // Использование списка аргументов переменной длины типа int
    static void vaTest (int ... v) {
        // ...
    }

    // Использование списка аргументов переменной длины типа boolean
    static void vaTest (boolean ... v) {
        // ...
    }

    public static void main(String[] args) {
        vaTest (1, 2, 3); // OK
        vaTest (true, false, false); // OK

        //  vaTest(); // Ошибка: неоднозначность вызова!     <--- Неопределенность!
    }
}
