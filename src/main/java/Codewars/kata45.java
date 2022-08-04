package Codewars;

public class kata45 {
    public static void main(String[] args) {
         System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
         System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
         System.out.println(findShort("Let's travel abroad shall we"));
    }
    // Учитывая строку слов, вернуть длинну кратчайшего слова (слов)
    // Строка никогда не будет пустой, не нужно учитывать разные типы данных.

    // План
    // Сплитануть проблемы, чтобы получить массив слов.
    // Создать переменную lowestShortWord, или lowestLength, которая будет принимать в себя интовое значение (длинну слова)
    // enhanced for.
    // return lowestLength.



    public static int findShort(String s) {
        String[] wordsArray = s.split(" ");
        int lowestLength = wordsArray[0].length();
        for (String word : wordsArray) {
            if(word.length() < lowestLength) {
                lowestLength = word.length();
            }
        }
        return lowestLength;
    }
}
