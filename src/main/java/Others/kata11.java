package Others;

public class kata11 {
    public static void main(String[] args) {
        int max = max(new int[]{4, 6, 2, 1, 9, 63, -134, 566});
        int min = min(new int[]{-52, 56, 30, 29, -54, 0, -110});
        System.out.println(max);
        System.out.println(min);
    }
// Написать две функции, максимум и минимум
// Которая будет получать список интеджеров (целых числе) и возврашать наибольшее, и наименьшее число в этом списке.

    public static int max(int[] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }
    public static int min(int[] list) {
        int min = list[0];
        for (int j = 1; j < list.length; j++) {
            if (list[j] < min) {
                min = list[j];
            }
        }
        return min;
    }
}





