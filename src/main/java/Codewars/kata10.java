package Codewars;


public class kata10 {
    public static void main(String[] args) {
        int[] years = humanYearsCatYearsDogYears(10);
        System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2]);
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{humanYears, 15, 15};
        }
        if (humanYears == 2) {
            return new int[]{humanYears, 24, 24};
        }

        int catAge = 24;
        int dogAge = 24;

        for (int i = 3; i <= humanYears; i++) {
            catAge += 4;
            dogAge += 5;
        }

        return new int[]{humanYears, catAge, dogAge};
    }


}
