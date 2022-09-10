package Codewars;

public class kata76 {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9));
        System.out.println(dontGiveMeFive(4, 17));
    }

    // Мы получаем начальный номер и конечный номер, должны вернуть количество всех чисел, кроме числа под номером 5.
    // Начальный и конечный номер включительно.
    // Примеры: 1,9 -> 1,2,3,4,,6,7,8,9 -> result 8.

    // Первоначальное число будет всегда меньше чем конечное число. оба числа могут быть отрицательными.

    // План:
    // Создание счетчика.
    // Бежим в цикле (int start) с начала и до конца (int end)
    //


    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                count++;
            }
        }
        return count;
    }

    public static boolean numberHasFive(int i) {
        return String.valueOf(i).contains("5");
    }
}


