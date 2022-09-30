package Codewars;

public class kata93 {
    public static void main(String[] args) {
        System.out.println(reverseLetter("krishan"));
        System.out.println(reverseLetter("ultr53o?n"));
        System.out.println(reverseLetter("ab23c"));
        System.out.println(reverseLetter("krish21an"));
    }

    public static String reverseLetter(final String str) {
        int StrLength = str.length();
        char[] charArray = new char[StrLength];        // создаю массив чаров такой же длинны, как и строка str

        for (int i = 0; i < StrLength; i++) {          // Бежим по длинне стринги str
            charArray [StrLength - i - 1] = str.charAt(i);   // заполняем массив символов (charArray) в обратном порядке символами строки.
        }
        return String.copyValueOf(charArray).replaceAll("[^A-Za-z]+","");   // загуглил регулярку, (подсмотрел)
    }
}
