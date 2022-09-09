package Codewars;

public class kata71 {
    public static void main(String[] args) {
        System.out.println(GetSum(0, -1));
        System.out.println(GetSum(0, 1));
    }



    public static int GetSum(int a, int b) {
        int sumOfElements = 0;
        int start;
        int end;
        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
        for (int i = start; i <= end; i++) {
            sumOfElements += i;
        }
        return sumOfElements;
    }
}
