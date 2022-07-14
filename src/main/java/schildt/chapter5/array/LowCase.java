package schildt.chapter5.array;

public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // В результате установки в еденицу шестого бита
            // Значения переменной ch она всегда будет содержать прописную букву

            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
