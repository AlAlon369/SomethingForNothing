package Codewars;

public class kata73 {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }
    // В маленьком городке, население p0 = 1000 на начало первого года.
    // Население регулярно увеличивается на 2 percent 1 год, и, кроме того каждый год в город приезжают 50 новых жителей.
    // Сколько лет нужно городу, чтобы его наслеение было больше или равно p = 1200 жителей?

    // p0 = население маленького городка, на начало года
    // percent
    // План
    // Создание перемменных int year, population.
    // Цикл while если population < p, population * percent + aug.

    // example:
    // 1000 + 1000 * percent + 50; (первая итерация цикла)

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int population = p0;
        while (population < p) {
            population += population * percent/100 + aug;
            years++;
        }
        return years;
    }
}
