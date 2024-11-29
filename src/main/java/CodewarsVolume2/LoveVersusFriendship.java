package CodewarsVolume2;

public class LoveVersusFriendship {
  public static void main(String[] args) {
    System.out.println(LoveVsFriendship.wordsToMarks("attitude"));
    System.out.println(LoveVsFriendship.wordsToMarks("friendship"));
    System.out.println(LoveVsFriendship.wordsToMarks("love"));
  }

  // План
  // Нам дана стринга, которая содержит текст
  // Нужно предать символам (чарам) значение, т.е. вычислить позицию букв в алфавите, пример а = 1, в = 4 и так далее.
  // Пробежать по циклу for, для каждого символа в сроке вычислить его позицию в алфавите
  // Суммоировать буквы (их позиции)
  // Вернуть сумму
  public class LoveVsFriendship {
    public static int wordsToMarks (String text) {
      int sum = 0;

      // Перебираем все символы строки
      for (char c : text.toCharArray()) {
        // Вычисляем позицию символа в алфавите и добавляем к сумме
        sum += c - 'a' + 1;          // вычисляет позицию буквы в алфавите
      }                              // Например, для 'a' это 97 - 97 + 1 = 1, для 'z' это 122 - 97 + 1 = 26.

      return sum;
    }
  }
}