package Codewars;

public class kata14 {
    public static void main(String[] args) {
        System.out.println(zeroFuel(85, 25, 2));

    }


    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
          return distanceToPump <= mpg * fuelLeft;

        }
    }
