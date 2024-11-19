package CodewarsVolume2;

import java.util.Arrays;

public class BubbleSortOnce {

  public static void main(String[] args) {
    // Тестовые примеры
    System.out.println(Arrays.toString(bubbleSortOnce(new int[]{9, 7, 5, 3, 1, 2, 4, 6, 8}))); // [7, 5, 3, 1, 2, 4, 6, 8, 9]
    System.out.println(Arrays.toString(bubbleSortOnce(new int[]{3, 2, 1})));                   // [2, 1, 3]
    System.out.println(Arrays.toString(bubbleSortOnce(new int[]{1, 2, 3})));                   // [1, 2, 3]
  }

  public static int[] bubbleSortOnce(int[] array) {
    // Копируем входной массив, чтобы не изменять оригинал
    int[] result = Arrays.copyOf(array, array.length);

    // Выполняем один полный проход пузырьковой сортировки
    for (int i = 0; i < result.length - 1; i++) {
      if (result[i] > result[i + 1]) {
        // Меняем элементы местами, если они не в порядке
        int temp = result[i];
        result[i] = result[i + 1];
        result[i + 1] = temp;
      }
    }

    return result;
  }
}