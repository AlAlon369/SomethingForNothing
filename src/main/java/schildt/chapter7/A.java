package schildt.chapter7;


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

    // Перегрузка метода show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: ");   // вызов метода show() из класса B
        subOb.show();   // вызов метода show() из класса Ф
    }
}

