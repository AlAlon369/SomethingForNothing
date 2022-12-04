package Codewars;

public class kata98 {
    public static void main(String[] args) {
        System.out.println(addLetters("a", "b", "c"));
        System.out.println(addLetters("z"));
        System.out.println(addLetters("c"));
        System.out.println(addLetters("z", "a"));
        System.out.println(addLetters("y", "c", "b"));
        System.out.println(addLetters());
    }

    // Задача сложить буквы в одну букву.
    // Функция получает массив односимвольных строк, каждая зи которых представляет собой букву для добавления.
    // Заметки:
    // Буквы всегда будут строчными.
    // Буквы могут выходить за пределы (см. предпоследний пример описания).
    // Если буквы не указаны (массив пуст), нужно вернуть букву "z"

    // План
    // Создать стрингу алфавит, которая содержит в себе символы алфавита.
    // Через индексоф найти эти символы, и далее сложить.

    // Если a = 1, b = 2, тогда a + b = c, так как c = 3;
    // Если выходить за пределы алфавита, то счет продолжается, пример:
    // addLetters("y", "c", "b") = "d" // notice the letters overflowing
    // y = 25, + c, где с = 3, + b, где b = 2. = "d', где d = 4.


    public static String addLetters(String... letters) {
        String alphabet = "zabcdefghijklmnopqrstuvwxyz";
        int result = 0;
        for (int i = 0; i < letters.length; i++) {
         //   alphabet += int[i];
            result += alphabet.indexOf(letters[i]);
        }

       // return String.valueOf(result);|
       // return String.valueOf(alphabet.charAt(result));
        return String.valueOf(alphabet.charAt(result % 26));
    }
}
