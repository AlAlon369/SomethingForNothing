package schildt.chapter6;

public class FailSoftArray {
    private int a[];       // ссылка на массив
    private int errval;    // значение, возвращаемое в случае возникновения ошибки при выполнении метода get()
    public int length;     // открытая переменная length

    // Конструктору данного класса передается размер массива и значение, которое должен возвращать метод get()
    // при возникновении ошибки
    public FailSoftArray (int size, int errv) {
        a = new int [size];
        errval = errv;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get (int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Установка значения элемента массива с заданным индексом
    // Если возникает ошибка, вернуть логическое значение false.
    public boolean put (int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Возврат логическое значения true, елси индекс не выходит за пределы массива.
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}
