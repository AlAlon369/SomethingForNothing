package Codewars;

public class kata63 {
    public static void main(String[] args) {
        System.out.println(move(0, 4));
        System.out.println(move(3, 6));
        System.out.println(move(2, 5));
    }





    public static int move(int position, int roll) {
        return roll * position * 2;
    }
}
