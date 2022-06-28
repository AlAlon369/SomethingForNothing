package Others;

import java.sql.SQLOutput;


public class ifDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b");
        // следующая строка никогда не будет выведена
        if (a == b) System.out.println("Вы не должны увидеть этот текст");
        System.out.println();



        c = a - b; // переменная "c" содержит значение -1
        System.out.println("c содержит -1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a; // переменная "с" теперь содержит значение 1

        System.out.println("c содержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");

    }
}
