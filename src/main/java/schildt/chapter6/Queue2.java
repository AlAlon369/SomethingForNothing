package schildt.chapter6;

// Класс, реализующий очередь для хранения символов
public class Queue2 {
    private char q[]; // Массив для хранения элементов очереди
    private int putloc, getloc;     // Индексы для вставки и извлечения элементов очереди

    // Создание пустой очереди заданного размера
    Queue2(int size) {
        q = new char[size + 1];   // выделения памяти для очереди
        putloc = getloc = 0;
    }

// Создание очереди на основе имеющегося объекта Queue2
Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копирование элементов в очередь
    for (int i = getloc + 1; i <= putloc; i++)
        q[i] = ob.q[i];
    // цикл for можно записать иначе: if(putloc + 1 - (getloc + 1) >= 0) System.arraycopy(ob.q, getloc + 1, q, getloc + 1, putloc + 1 - (getloc + 1));
}
// Создание очереди на основе массива исходных значений
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] =ch;
    }
    // Извлечение символа из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}