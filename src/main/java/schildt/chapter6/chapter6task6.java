package schildt.chapter6;

public class chapter6task6 {
    // Написать рекурсивный метод, отображающий строку задом наперед
    public static void main(String[] args) {
        reverse("test");
    }
    static void reverse(String value) {
        if (value.length() == 0) {
            return;
        }
        String lastLetter = value.substring(value.length() - 1);
        System.out.print(lastLetter);
        reverse(value.substring(0, value.length() - 1));
    }
}


