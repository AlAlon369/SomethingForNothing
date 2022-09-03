package schildt.chapter7;

// Использование ключевого слова super
// для предотвращения сокрытия имен

public class A {
    A() {
        System.out.println("Конструктор А");
    }
}
// Создание подкласса, расширяющего класса A
class B extends A {
    B() {
        System.out.println("Конструктор B");
    }
    }

    class C extends B {
        C() {
            System.out.println("Конструктор С");
    }
}
class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}
