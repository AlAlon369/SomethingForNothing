package Codewars;

import java.util.Objects;

public class kata25 {
    public static void main(String[] args) {
        System.out.println(greet("Daniel", "Daniel"));
        System.out.println(greet("Greg", "Daniel"));
    }

    // СОздать функцию которая будет вылавать персонализированное приветстввие, принимающая в себя два параметра
    // name и hello.
    // В другом случае "Hello guest"

    static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
   //      if (Objects.equals(name, owner)) {
   //         return "Hello boss";
   //     } else {
   //         return "Hello quest";
        }
    }
}
