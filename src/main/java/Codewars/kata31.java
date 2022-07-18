package Codewars;

public class kata31 {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
        System.out.println(noBoringZeros(960000));
        System.out.println(noBoringZeros(1050));
        System.out.println(noBoringZeros(-1050));
    }


    // избавиться от нулей.
    // от конечных нулей.

    public static int noBoringZeros(int n) {
     //   return n / 10;

         String number = String.valueOf(n);
         String numberAfterReplace = number.replaceAll("[0]+$", "");

         return Integer.parseInt(numberAfterReplace);



        // if (n == 0) return n;
        //
        // while                   // посмотреть цикл вайл в интернете
    }





}
