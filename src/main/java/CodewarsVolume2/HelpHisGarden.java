package CodewarsVolume2;

public class HelpHisGarden {
  public static void main(String[] args) {
    // Тест 1: Пример с различными элементами
    String garden1 = "slug spider rock gravel gravel gravel gravel gravel gravel gravel";
    System.out.println(Kata.rakeGarden(garden1));

    // Тест 2: Большой пример с множества элементов
    String garden2 = "gravel gravel gravel gravel gravel gravel gravel gravel gravel rock slug ant gravel gravel snail rock gravel gravel gravel gravel gravel gravel gravel slug gravel ant gravel gravel gravel gravel rock slug gravel gravel gravel gravel gravel snail gravel gravel rock gravel snail slug gravel gravel spider gravel gravel gravel gravel gravel gravel gravel gravel moss gravel gravel gravel snail gravel gravel gravel ant gravel gravel moss gravel gravel gravel gravel snail gravel gravel gravel gravel slug gravel rock gravel gravel rock gravel gravel gravel gravel snail gravel gravel rock gravel gravel gravel gravel gravel spider gravel rock gravel gravel";
    System.out.println(Kata.rakeGarden(garden2));
  }

  // План
  // Мы получаем строку garden, где элементы разделены пробелом.
  // Элементы сада могут быть slug, spider, ant, rock, gravel.
  // Задача убрать все ненужные элементы кроме rock и gravel.
  // Спилим стрингу на массив, используя " "
  // бежим по циклу фор: если элемент не равен rock или graver, заменяем его на gravel.
  // Преобразуем массив обратно в строку и на выход.

  public class Kata {
    // Метод для приведения сада к Zen-состоянию
    public static String rakeGarden(String garden) {
      // Шаг 1: Разделение строки на отдельные элементы
      String[] items = garden.split(" ");

      // Шаг 2: Проход по каждому элементу массива
      for (int i = 0; i < items.length; i++) {
        // Шаг 3: Замена всех элементов, не являющихся "rock" или "gravel", на "gravel"
        if (!items[i].equals("rock") && !items[i].equals("gravel")) {
          items[i] = "gravel";
        }
      }

      // Шаг 4: Объединение массива обратно в строку
      return String.join(" ", items);
    }
  }
}
