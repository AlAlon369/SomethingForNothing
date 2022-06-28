package Codewars;

public class Kata {
    public static void main(String[] args) {


    }

    public static int makeNegative(final int x) {
        if (x >= 0){
           return -x;
        }
           if (x == 5){
               return -5;
           }
        return x;


        //return x > 0 ? x * -1 : x;
        //return x > 0 ? -x : x; // второе решение.


    }

}