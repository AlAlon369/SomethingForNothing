package CodewarsVolume2;

public class GetTheMiddleCharacter {

  public static void main(String[] args) {
    // Тестовые примеры
    System.out.println(Kata.getMiddle("test"));
    System.out.println(Kata.getMiddle("testing"));
    System.out.println(Kata.getMiddle("middle"));
    System.out.println(Kata.getMiddle("A"));
  }

  static class Kata {
    public static String getMiddle(String word) {
      int elementPosition;
      int elementLength;

      if (word.length() % 2 == 0) {
        elementPosition = word.length() / 2 - 1;
        elementLength = 2;
      } else {
        elementPosition = word.length() / 2;
        elementLength = 1;
      }
      return word.substring(elementPosition, elementPosition + elementLength);
    }
  }
}