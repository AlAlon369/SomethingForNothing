package Codewars;

public class kata56 {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));
    }





    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
