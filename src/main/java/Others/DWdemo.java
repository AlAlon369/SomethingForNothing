package Others;

public class DWdemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read(); // чтение символа с клавиатуры
        }   while (ch != 'q');

        // Выполнение цикла будет продолжаться до тех пор, пока пользователь не угадает букву.
    }
}
