package schildt.chapter8;

// Усовершенствованная версия интерфейса Series, которая включает используемый по умолчанию метод getNextArray()
public interface Series {
    int getNext();   // возврат следующего числа в ряду

    // Возврат массива, который содержит n элементов, располагающихся в ряду за текущим элементом.
    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
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