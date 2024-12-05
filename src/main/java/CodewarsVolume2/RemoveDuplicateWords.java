package CodewarsVolume2;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
  public static void main(String[] args) {
    System.out.println(Solution.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
  }

  // План
  // К нам приходит класс стринг, который содержит в себе длинную строку из разных слов, которые повторяются
  // Нам нужно, оставить только уникальные слова, убрав дубликаты.
  // Реализовать с помощью HashSet

  class Solution{
    public static String removeDuplicateWords(String s){
      String str = s;
      String[] array = str.split(" ");
      LinkedHashSet<String> set = new LinkedHashSet<>();

      for (String element : array) {
        set.add(element);
      }
      String result = String.join(" ", set);
      return result;
    }
  }
}
