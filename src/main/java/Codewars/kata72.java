package Codewars;

public class kata72 {
    public static void main(String[] args) {
      //  System.out.println(maskify("4556364607935616"));
      //  System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }





    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() < 5) {
            return str;
        }
        String last4Chars = str.substring(str.length()-4);

        for (int i = 0; i < str.length() - 4; i++) {
            sb.append("#");
        }
        return sb + last4Chars;
    }
}
