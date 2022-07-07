package schildt.chapter5.array;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель интернета.";

        // Оформить подстроку
        String substr = orgstr.substring(7, 25);

        System.out.println("orgstr: " + orgstr);
        System.out.println("orgstr: " + substr);

    }
}
