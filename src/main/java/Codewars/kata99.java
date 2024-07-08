package Codewars;

import java.util.ArrayList;
import java.util.List;

public class kata99 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        System.out.println(removeDuplicateWords("my cat is my cat fat"));
    }

    public static String removeDuplicateWords(String s) {
        String words[] = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (!(list.contains(word))) {
                list.add(word);
            }
        }
        String resultStr = String.join(" ", list);
        return resultStr;
    }
}