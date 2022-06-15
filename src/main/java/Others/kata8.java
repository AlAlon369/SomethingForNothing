package Others;

public class kata8 {
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
        System.out.println(bmi(55, 1.61));
        System.out.println(bmi(123, 1.56));
        System.out.println(bmi(199, 2.10));

    }

    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi > 30) {
            return "Overweight";
        }
        return "Obese";

    }
}