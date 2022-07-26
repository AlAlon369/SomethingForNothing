package schildt.chapter6;


// Усовершенствованный класс очереди, предназначенной для хранения символьных значений

class Queue {
    // Эти члены класса теперь являются закрытыми
    private char q[];   // Массив для хранения элементов очереди
    private int putloc, getloc;   // индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size];   // выделения памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
