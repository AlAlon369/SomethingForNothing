package schildt.chapter7;

// Переопределение метода

public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k - переопределение метода show() в A
    void show() {     // <---   Метод show() в B переопределяет метод show в А
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show();   // вызов метода show() из класса И
    }
}

