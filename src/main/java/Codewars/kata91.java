package Codewars;

public class kata91 {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("ninja", "ja"));
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
