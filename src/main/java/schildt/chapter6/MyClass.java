package schildt.chapter6;

public class MyClass {
        private int alpha;      // закрытый доступ
        public int beta;        // открытый доступ
        int gamma;              // тип доступа по умолчанию (по сути, public)

        // Методы доступа к переменной alpha. Члены класса могут обращаться к закрытым членам того же класса.
        void setAlpha(int a) {      // открытый метод доступа
            alpha = a;
        }

        int getAlpha() {            // открытый метод доступа
            return alpha;
        }
    }



