package CodewarsVolume2;

public class ChangingLetters {
  // Метод swap для изменения гласных на заглавные
  public static String swap(String st) {
    // Создаем StringBuilder для формирования результирующей строки
    StringBuilder result = new StringBuilder();

    // Проходим по каждому символу строки
    for (char c : st.toCharArray()) {
      // Проверяем, является ли символ гласной
      if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
        // Если гласная, добавляем её в верхнем регистре
        result.append(Character.toUpperCase(c));
      } else {
        // Иначе добавляем символ без изменений
        result.append(c);
      }
    }

    // Возвращаем результирующую строку
    return result.toString();
  }

  // Метод main для тестирования
  public static void main(String[] args) {
    // Примеры тестов
    System.out.println(swap("Hello World!")); // Ожидается: HEllO WOrld!
    System.out.println(swap("Codewars")); // Ожидается: COdEwArs
    System.out.println(swap("java programming")); // Ожидается: jAvA prOgrAmmIng
    System.out.println(swap("AEIOUaeiou")); // Ожидается: AEIOUAEIOU
  }
}