package Codewars;

public class kata33 {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("What are you, a communist?"));
    }
    // Удалить все гласные буквы из комментариев троллей.
    // Написать функцию, которая принимает строку, и возвращает строку в которой удалены все гласные
    // у - не считается гласной.

    // гласные буквы


    public static String disemvowel(String str) {
        return str.replaceAll("[aeiIoOu]", "");



        /*
        for (int i = 0; i < str.length(); i++) {
            switch (Character.toLowerCase(str.charAt(i))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
            }
        }
        return str;

         */
    }
}

