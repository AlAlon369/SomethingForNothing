package schildt.chapter9;

public class ThrowsDemo {
    public static char prompt(String str)
        throws java.io.IOException {     // Обратите внимание на спецификацию throws в объявлении метода

        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Введите букву");
        }
        catch(java.io.IOException exc) {     // В методе prompt() может быть сшенерировано исключение, поэтому его
                                             // вызов следует заключить в блок try
            System.out.println("Произошло исключение ввода-вывода");

            ch = 'X';
        }
        System.out.println("Вы нажали клавишу " + ch);
    }
}
