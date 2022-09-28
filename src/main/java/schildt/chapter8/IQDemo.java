package schildt.chapter8;


public class IQDemo {
}

// Класс, реализующий очередь фиксированного размера для хранения символов

class FixedQueue implements ICharQ {
    private char q[];             // массив для хранения элементов очереди
    private int putloc, getloc;   // индексы вставляемых и извлекаемых элементов


// Создание пустой очереди заданного размера
public FixedQueue (int size) {
    q = new char[size];   // выделение памяти для очереди
    putloc = getloc = 0;
}

// Помещение символа в очередь
public void put(char ch) {
    if (putloc == q.length) {
        System.out.println(" - Очередь заполнена");
    }

    q[putloc++] = ch;
}
    public char get() {
    if (getloc == putloc) {
        System.out.println(" - Очередь пуста");
        return (char) 0;
    }

    return q[getloc++];
    }
}

// Кольцевая очередь
class CircularQueue implements ICharQ {
    private char q[];   // массив для хранения элементов очереди
    private int putloc, getloc;   // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue (int size) {
        q = new char [size+1];   // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
           // Очередь считается полной, если индекс putloc на единицу меньше индеккса getloc или если индекс putloc
           // указывает на конец массива, а индекс getloc - на его начало
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
            }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;   // перейти в начало массива
    }

    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;   // вернуться в начало очереди

        return q[getloc];
    }
}
