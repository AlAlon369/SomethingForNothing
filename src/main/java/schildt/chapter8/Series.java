package schildt.chapter8;

public interface Series {
    int getNext();   // возврат следующего по порядку числа
    void reset();   // сброс
    void setStart (int x);   // установка начального значения
}
