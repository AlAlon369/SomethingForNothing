package Codewars;

public class kata31 {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
        System.out.println(noBoringZeros(960000));
        System.out.println(noBoringZeros(1050));
        System.out.println(noBoringZeros(-1050));
    }
    public static int noBoringZeros(int n) {
        String number = String.valueOf(n);
        String numberAfterReplace = number.replaceAll("[0]+$", "");
        return Integer.parseInt(numberAfterReplace);
    }
}
