package schildt.chapter10;

// Демонстрация метода System.out.write()

public class WriteDemo {
    public static void main(String[] args) {
        int b;

        b = 'X';
        System.out.write(b);       // Запись байта в поток
        System.out.write('\n');
    }
}
