package CodewarsVolume2;

public class SmallestValueOfAnArray {
  public static void main(String[] args) {
    // Проверка решения
    System.out.println(Codewars.findSmallest(new int[]{1, 2, 3, 4, 5}, "value")); // Ожидает: 1
    System.out.println(Codewars.findSmallest(new int[]{1, 2, 3, 4, 5}, "index")); // Ожидает: 0
    System.out.println(Codewars.findSmallest(new int[]{10, -3, 7, 5}, "value"));  // Ожидает: -3
    System.out.println(Codewars.findSmallest(new int[]{10, -3, 7, 5}, "index"));  // Ожидает: 1
  }

  // План
  // Создание переменных, которые будут хранить минимальный индекс, а также минимальное значение внутри массива.
  // Бежим по циклу фор, сравниваем значение, ибо самое первое значение будет априори минимальным.
  public static class Codewars {
    public static int findSmallest(int[] numbers, String mode) {
      int minIndex = 0; //  Инициализируется нулём, так как первый элемент массива всегда считается минимальным на
      // начальном этапе.
      int minValue = numbers[0]; // Инициализируется значением первого элемента массива (numbers[0]).

      // Поиск минимального значения и индекса
      for (int i = 1; i < numbers.length; i++) {   // На каждой итерации проверяем: меньше ли текущий элемент массива numbers[i],
        if (numbers[i] < minValue) {               //  чем текущее минимальное значение (minValue).
          minValue = numbers[i];
          minIndex = i;
        }
      }

      // Возврат в зависимости от режима
      return "value".equals(mode) ? minValue : minIndex;
    }
  }
}