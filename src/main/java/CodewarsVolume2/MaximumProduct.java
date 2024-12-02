package CodewarsVolume2;

public class MaximumProduct {
  public static void main(String[] args) {
    // Создаем экземпляр класса MaxProduct
    MaxProduct maxProductFinder = new MaxProduct();

    // Пример 1
    int[] array1 = {1, 2, 3};
    System.out.println("Максимальное произведение: " + maxProductFinder.adjacentElementsProduct(array1)); // Ожидается: 6

    // Пример 2
    int[] array2 = {9, 5, 10, 2, 24, -1, -48};
    System.out.println("Максимальное произведение: " + maxProductFinder.adjacentElementsProduct(array2)); // Ожидается: 50

    // Пример 3
    int[] array3 = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
    System.out.println("Максимальное произведение: " + maxProductFinder.adjacentElementsProduct(array3)); // Ожидается: -14

    // Пример 4: массив из двух элементов
    int[] array4 = {5, -2};
    System.out.println("Максимальное произведение: " + maxProductFinder.adjacentElementsProduct(array4)); // Ожидается: -10

    // Пример 5: массив с нулями
    int[] array5 = {0, 2, 3, -1, 0, 5};
    System.out.println("Максимальное произведение: " + maxProductFinder.adjacentElementsProduct(array5)); // Ожидается: 6
  }
}

  // План
  // Нужно найти максимальное произведение двух соседних элементов в массиве array
  // Массив в может содержать положительные и отрицательные значения, нули. Но всегда содержит минимум два элемента.

  // Перебрать массив, начиная с первого элемента и заканчивая предпоследним.
  // Для каждого элемента вычислить произвоедение с его соседом справа
  // На каждом шаге сохранять максимальное из найденных произведений.

  // Создать переменную, которая будет хранить максимальное произведение.
  // Использовать цикл for начиная с 0 индекса, до array.length -2 (чтобы не выйти за пределы массива)
  // После завершения цикла вернуть значение maxProduct


