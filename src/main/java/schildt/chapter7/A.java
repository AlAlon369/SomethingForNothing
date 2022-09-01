package schildt.chapter7;

// Использование ключевого слова super
// для предотвращения сокрытия имен

public class A {
    int i;
}

// Создание подкласса, расширяющего класса A
class B extends A {
    int i;   // Эта переменная i скрывает переменную i из класса A

    B (int a, int b) {
        super.i = a;      // Переменная i из класса A <--- Здесь супер i ссылается на переменную i из класса A
        i = b;            // переменная i из класса B
    }
        void show() {
            System.out.println("i в суперклассе: " + super.i);
            System.out.println("i в подклассе: " + i);
        }
    }

    class UseSuper {
        public static void main(String[] args) {
            B subOb = new B(1, 2);
            subOb.show();
    }
}
