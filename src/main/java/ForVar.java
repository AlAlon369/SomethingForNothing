public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++)  {    // Переменная i объявляется в самом цикле for
            sum += i;
            fact *= i;
        }
        // Однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
