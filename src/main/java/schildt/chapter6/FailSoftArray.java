package schildt.chapter6;

public class FailSoftArray {
    private int array[];       // ссылка на массив
    private int errorValue;    // значение, возвращаемое в случае возникновения ошибки при выполнении метода get()
    public int length;     // открытая переменная length

    // Конструктору данного класса передается размер массива и значение, которое должен возвращать метод get()
    // при возникновении ошибки
    public FailSoftArray (int size, int errorValue) {
        array = new int [size];
        this.errorValue = errorValue;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get (int index) {
        if (indexOK(index)) return array[index];
        return errorValue;
    }

    // Установка значения элемента массива с заданным индексом
    // Если возникает ошибка, вернуть логическое значение false.
    public boolean put (int index, int val) {
        if (indexOK(index)) {
            array[index] = val;
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
