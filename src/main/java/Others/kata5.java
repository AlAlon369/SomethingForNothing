package Others;

public class kata5{
    public static void main(String[] args) {
        System.out.println(century(2001));
        System.out.println(century(963));
        System.out.println(century(369));
        System.out.println(century(2156));
    }


    public static int century(int number) {
        int century;
        if (number % 100 == 0) {
            century = number / 100;
        } else {
            century = number / 100 + 1;
        }
        return century;
    }

}