package schildt.chapter5.array;

public class NoZeroDiv2 {
    public static void main(String[] args) {

        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false)    // Если значение переменной i равно нулю, то оператор ? возвращает логическое значение false, что предотвращает деление на нуль.
                System.out.println("100 / " + i + " равно " + 100 / i);
        }
    }
}
