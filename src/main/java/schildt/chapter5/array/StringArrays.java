package schildt.chapter5.array;

public class StringArrays {
    public static void main(String[] args) {
        String strs [] = { "Эта", "строка", "является", "тестом."};
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // Изменения строки
        strs[2] = "также является";
        strs[3] = "тестом!";

        System.out.println("Измененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");

    }
}
