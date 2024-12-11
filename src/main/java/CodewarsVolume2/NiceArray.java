package CodewarsVolume2;
import java.util.*;

public class NiceArray {
  public static void main(String[] args) {
    System.out.println(Kata.isNice(new Integer[]{1,2,3,4,5}));
    System.out.println(Kata.isNice(new Integer[]{5,4,3,2,1}));
    System.out.println(Kata.isNice(new Integer[]{10,10,2,2,3}));
    System.out.println(Kata.isNice(new Integer[]{}));

  }

  // План
  // Нам дан массив, в рамках данного массива нам необходимо реализовать метод isNice
  // Пример Найс Массива:
  // [2, 10, 9, 3] is a nice array because
  //
  //  2 =  3 - 1
  // 10 =  9 + 1
  //  3 =  2 + 1
  //  9 = 10 - 1

  // Пример not nice массива:
  // [4, 2, 1] is a not a nice array because
  //
  // for n = 4, there is neither n - 1 = 3 nor n + 1 = 5

  // Для начала нужно проверить пустой массив:
  // Проверить, является ли входной массив пустым. Если массив пустой, вернуть false, так как пустой массив не считается "nice".
  // Преобразовать массив arr в объект типа Set для более эффективной проверки наличия элементов (n - 1 и n + 1).
  // Используем класс HashSet из стандартной библиотеки.
  // Далее проходим итерацию по каждому элементу массива.
  // Для каждого элемента n проверить, присутствует ли в наборе хотя бы один из элементов: n - 1 или n + 1.
  // Если хотя бы для одного элемента условия не выполняются, вернуть false.
  // Если все элементы удовлетворяют условию, вернуть true после завершения цикла.
  // Убедиться, что логика корректно работает, даже если массив содержит дублирующиеся значения.

  public static class Kata {
    public static boolean isNice(Integer[] arr) {
      // 1. Проверяем, пустой ли массив
      if (arr.length == 0) return false;

      // 2. Преобразуем массив в Set для быстрой проверки
      Set<Integer> set = new HashSet<>(Arrays.asList(arr));

      // 3. Итерируем по каждому элементу массива
      for (int n : arr) {
        // 4. Проверяем наличие n - 1 или n + 1
        if (!set.contains(n - 1) && !set.contains(n + 1)) {
          return false; // Если условие не выполнено, массив не "nice"
        }
      }

      // 5. Если все элементы прошли проверку, возвращаем true
      return true;
    }
  }
}