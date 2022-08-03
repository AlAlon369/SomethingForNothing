package Codewars;

import java.lang.reflect.Array;

public class kata44 {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase(null));
        // System.out.println(doFirstLetterUpperCase("hello"));
        // System.out.println(doFirstLetterUpperCase(""));
        // System.out.println(doFirstLetterUpperCase(null));
    }

    // Мне приходит стринга "Фраза", нужно чтобы каждое слово в стринге начиналось с большой буквы.
    // Пример, Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
    // Строки могут приходить разные, например "most trees are blue" expected "Most Trees Are Blue"
    // Возвращать будем стрингу, работаем с фразами.


    // К нам приходит фраза, через сабстринг, вырезать первый символ и заменить его на символ.toUpperCase()
    // План
    // Возвратить null Для пустой строки "" или null
    //

    // получить в методе слово, увеличить первую группу.
    // декомпозировать задачу (загуглить)

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return phrase;
        }
        if (phrase.equals("")) {
            return null;
        }
        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String result = doFirstLetterUpperCase(word);
            sb.append(result);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static String doFirstLetterUpperCase(String phrase) {
        return phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
    }
}