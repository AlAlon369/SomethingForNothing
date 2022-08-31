package Codewars;

public class kata66 {
    public static void main(String[] args) {
        System.out.println(oddOrEven((new int[]{2, 5, 34, 6})));
    }

    // Дан список целых числе, определить, является ли сумма его элементов четной или нечетной.
    // Дайте ответ в виде сопоставления строк "odd" или "even"
    // Если на выходе массив пуст, рассматривайте его как [0] (массив с нулем)

    // План
    // Указать если длинна массива равна нулю, вернуть "even" потому что 0 - четное.
    // Создать переменную sumOfElements.
    // Пробежаться по массиву, если элемент не != 0, сложить элемент в переменную sumOfElements;
    // Если sumOfElements % 2 == 0, return "even"
    // return "odd"


    public static String oddOrEven(int[] array) {
        if (array.length == 0) {
            return "even";
        }
        int sumOfElements = 0;
        for (Integer element : array) {
            sumOfElements += element;
        }
        if (sumOfElements % 2 != 0) {
            return "odd";
        }
        return "even";
    }
}