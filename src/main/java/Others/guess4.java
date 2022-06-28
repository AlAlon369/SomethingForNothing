package Others;

public class guess4 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ignore, answer = 'R';

        do {
            System.out.println("Задуманна буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать: ");

            // получение символа с клавиатуры
            ch = (char) System.in.read();

            // отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println(" ** Правильно! **");
            else {
                System.out.print("... Извините, нужная буква находится ");
                if (ch < answer) System.out.println("Ближе к концу алфавита");
                else System.out.println("Ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        }       while (answer != ch);
    }
}
