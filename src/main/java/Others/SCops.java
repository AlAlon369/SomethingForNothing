package Others;

public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
        System.out.println(d + "Является делителем " + n);

        d = 0; // установить для d нулевое значение

        // второй операнд не вычесляет, поскольку значение переменной d равно нулю
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);
        // А теперь те же самые действия выполняются без использования укороченного
        // логического оператора. В результате возникает деление ошибка деления на нуль.

        if (d != 0 & (n % d) == 0)
            System.out.println(d + " является делителем " + n);




    }
}
