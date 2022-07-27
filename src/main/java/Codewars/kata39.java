package Codewars;

public class kata39 {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));       // "es"
        System.out.println(getMiddle("testing"));    // "t"
        System.out.println(getMiddle("middle"));     // "dd"
        System.out.println(getMiddle("A"));          // "A"
    }

      // Нам приходит слово (стринга), если длинна слова нечетная, вернуть 1 символ (char)
      // Если длинна слова четная верните 2 символа по середине

      // План
      // Инициализировать позицию символа
      // Пробегаясь по длинне строки, выяснить количество символов, четное или не четное.
      // Деление на остаток ( % 2) если == 0, значит четное.
      // Нечетное ? (как то отработать с else)
      // if, else ? Или Enhanced for ?

    public static String getMiddle(String word) {
        int elementPosition;
        int elementLength;

        if (word.length() % 2 == 0) {     // Четное
            elementPosition = word.length() / 2 - 1 ;
            elementLength = 2;            // Если длинна стринги четная, вернуть два символа (середина стринги)

        } else {
            elementPosition = word.length() / 2; // Нечетное
            elementLength = 1;                  // Если длинна слова нечетная вернуть средний символ
        }
        return word.substring(elementPosition, elementPosition + elementLength);
    }
}
