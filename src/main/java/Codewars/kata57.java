package Codewars;

public class kata57 {
    public static void main(String[] args) {
        System.out.println(binToDecimal("1"));
        System.out.println(binToDecimal("0"));
        System.out.println(binToDecimal("1001001"));
    }

       // Завершите функцию которая преобразует двоичное число типа String
       // в десятичное число, типа int



    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }
}
