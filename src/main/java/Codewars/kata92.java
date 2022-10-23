package Codewars;

public class kata92 {
    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println((mxdiflg(s1, s2)));
    }
    // Даны два массива строки, а1 и а2. Каждая строка состоит из букв от 'a' до 'z'. (x) - будет любая строка
    // в первом массиве, и (y) любой строкой во втором массиве.

    // Если а1 или а2 пусты, вернуть -1.
    // Ввод 2 строки, с подстроками, разделенными ","
    // return число в виде строки, например "14"


    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0)
            return -1;

        int lengthForA1 = 0;
        int lengthForA2 = 0;
        int length1 = Integer.MAX_VALUE, length2 = Integer.MAX_VALUE;

        for (String s : a1) {
            lengthForA1 = Math.max(lengthForA1, s.length());
            length1 = Math.min(length1, s.length());
        }
        for (String s : a2) {
            lengthForA2 = Math.max(lengthForA2, s.length());
            length2 = Math.min(length2, s.length());
        }

        return Math.max(Math.abs(lengthForA2 - length1), Math.abs(lengthForA1 - length2));
    }
}
