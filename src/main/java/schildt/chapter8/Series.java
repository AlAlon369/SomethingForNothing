package schildt.chapter8;

import static com.jogamp.common.nio.Buffers.getArray;

// Еще одна расширенная версия интерфейса Series, включающая два заданных по умолчанию метода и использующая закрытый метод getArray();
public interface Series {
    int getNext();   // возврат следующего числа в ряду

    // Возврат массива, который содержит n элементов ряда, помимо текущего элемента
    default int[] getNextArray(int n) {
        return (int[]) getArray(n);
    }

    // Возврат массива, содержащего следующие n элементов в ряду, после пропуска элементов
    default int[] skipAndGetNextArray(int skip, int n) {
        // Пропуск указанного числа элементов
        getArray(skip);

        return (int[]) getArray(n);
    }
    void reset();   // сброс

    void setStart(int x);   // установка начального значения
}

class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart (int x) {
        start = x;
        val = x;
    }
}
class ByThrees implements Series {         // Другая реализация интерфейса Series
    int start;
    int val;
    ByThrees() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 3;
        return val;
    }
    public void reset() {
        start = 0;
        val = 0;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;  // Доступ с помощью интерфейсной ссылки
            System.out.println("Следующее значение ByTwos: " + ob.getNext());   // Доступ с помощью интерфейсной ссылки

            ob = threeOb;   // Доступ с помощью интерфейсной ссылки
            System.out.println("Следующее значение Next ByThrees: " + ob.getNext());  // Доступ с помощью интерфейсной ссылки
        }
    }
}