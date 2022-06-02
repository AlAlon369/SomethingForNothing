public class primenumbers {
    public static void main(String[] args) {

        int i, j;
        boolean isPrime;    // функция isPrime

        for (i = 2; i < 100; i++) {       // цикл for где i равна еденице, но меньше 100
            isPrime = true;               // постфиксный инкремент с логическим значением true

            for (j = 2; j <= i / j; j++) {
                System.out.println(i + " : " + j); // вывод
                if ((i % j) == 0)        // У простых чисел два возможных делителя, число делится на себя, или на 1
                    isPrime = false;
            }

            if (isPrime)
                System.out.println(i + "-простое число");
        }

    }
}