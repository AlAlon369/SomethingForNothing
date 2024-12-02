package CodewarsVolume2;

public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    // Инициализируем максимальное произведение первыми двумя элементами массива
    int maxProduct = array[0] * array[1];

    // Проходим по массиву от первого до предпоследнего элемента
    for (int i = 1; i < array.length - 1; i++) {
      // Вычисляем произведение текущего элемента и следующего
      int product = array[i] * array[i + 1];

      // Обновляем максимальное произведение, если найдено большее
      if (product > maxProduct) {
        maxProduct = product;
      }
    }
    // Возвращаем максимальное произведение
    return maxProduct;
  }
}
