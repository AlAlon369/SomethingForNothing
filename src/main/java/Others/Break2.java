package Others;

public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for ( ; ;) {       // < --- бесконечный цикл, завершаемый инструкцией break
            ch = (char) System.in.read();  // получение символа с клавиатуры

            if (ch == 'q') break;   // // < --- бесконечный цикл, щавершаемый инструкцией break
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
