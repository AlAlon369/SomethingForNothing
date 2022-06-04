public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(even_or_odd(10));
        System.out.println(even_or_odd(15));
    }

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }


    }
}


// Создайте функцию, которая принимает целое число в качестве аргумента и возвращает
// «Четное» для четных чисел или «Нечетное» для нечетных чисел.