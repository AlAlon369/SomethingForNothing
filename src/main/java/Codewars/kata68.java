package Codewars;

public class kata68 {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.05,0.18,1100));
        System.out.println(calculateYears(1000,0.01625,0.18,1200));
        System.out.println(calculateYears(1000,0.05,0.18,1000));
    }

     // Мистер Скрудж имеет определенную сумму денег (P) - principal, которую он хочет инвестировать.
     // Прежде чем он это сделает, он хочет знать, сколько лет (Y) эта сумма (P) должна храниться в банке.
     // Чтобы она составила желаему сумму денег (D)
     // Налогом облагается не инвестированная основная сумма, а только начисленные проценты за год.
     // Таким образом, Скрудж должен ждать 3 года, чтобы первоначальный основной капитал составил желаемую сумму.
     // Нужно завершить предоставленный метод и вернуть количество лет (Y) в целом, чтобы мистер Скрудж получил желанную сумму.
     // Предположим что желаемый principal (D) всегда больше, чем первоначальный principal. Стоит принять во внимание,
     // если желаемый основной (D) равен основному (P), это должно вернуть 0 лет.

     // P = Principal = 1000.00
     // I = Interest Rate = 0.05
     // T = Tax Rate = 0.18
     // D = Desired Sum 1100.00
     // Y = Years (return)

     // План
     // Если principal == desired return 0;
     // Создание перемменных, работа с инфами.
     // Нужен цикл, для years++
     // fori foreach не работают, почитать про цикл while
     // while principal < desired, написать тело цикла.
     // return years

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        double summaDoNalogov = principal * interest;
        double summaPosleNalogov = summaDoNalogov * tax;

        if (principal == desired) {
            return 0;
        }
        while (principal < desired) {
            principal += (summaDoNalogov - (summaPosleNalogov - tax));
            years++;
        }
        return years;
    }
}
