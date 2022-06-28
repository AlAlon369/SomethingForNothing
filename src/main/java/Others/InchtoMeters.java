package Others;

public class InchtoMeters {
    public static void main(String[] args) {
        double meter, inch;
        int counter;

        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            meter = inch * 39.37; // преборазование в метры
            System.out.println(inch + " дюймы соответствует " + meter + " метра ");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
    }
}
