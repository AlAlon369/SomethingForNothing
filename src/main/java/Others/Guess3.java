package Others;

public class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("Задуманная буква из диапазона A-Z.");
        System.out.println("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); // чтение символа с клавиатуры

        if (ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.println("... Извините нужная буква находится ");

            // вложенная инструкция if
            if (ch < answer) System.out.println("Ближе к концу алфавита");
            else System.out.println("Ближе к началу алфавита");
        }

    }
}
