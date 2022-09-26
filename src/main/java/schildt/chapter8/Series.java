package schildt.chapter8;

public interface Series {
    int getNext();   // возврат следующего по порядку числа
    void reset();   // сброс
    void setStart (int x);   // установка начального значения
}

// Реализация интерфейса Series

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

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++ ) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
            System.out.println("\nСброс");
            ob.reset();


        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
            System.out.println("\nНачальное значение: 100");
            ob.setStart(100);
            for (int i = 0; i < 5; i++) {
                System.out.println("Следующее значение: " + ob.getNext());

        }
    }
}