package Codewars;

public class kata36 {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }
    // Нам дан массив разделенных пробелом числе.
    // Нужно вернуть наименьшее и наибольшое число.

    // План:
    // Обратиться к массиву чисел.
    // Пробежаться по массиву, возвратить наименьшее и наибольшее число.

    // 1. Сплитнуть стрингу (получу массив строк)
    // 3. Создаю цикл, прохожусь по массиву стрингов.
    // 4. Если элемент меньше min - присваиваем в min этот элемент.
    // 5. Если эжлемент больше max - присваиваем в max этот элемент.
    // 6. Вернуть стрингу min пробел max + " " +


    public static String highAndLow(String numbers) {
        String strArray[] = numbers.split(" ");
        final String firstElement = strArray[0];
        int maximum = Integer.parseInt(firstElement);
        int minimum = Integer.parseInt(firstElement);

        for (String element : strArray) {
            final int elementInteger = Integer.parseInt(element);
            if (elementInteger > maximum) {
                maximum = elementInteger;
            }
            if (elementInteger < minimum) {
                minimum = elementInteger;
            }
        }
        return Integer.parseInt(String.valueOf(maximum)) + " " + Integer.parseInt(String.valueOf(minimum));
    }
}

