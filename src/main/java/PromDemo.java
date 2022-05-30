public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;             // приведение типов не требуется, так как тип уже повышен до int.
        i = b * b;

        b = 10;
        b = (byte) (b * b);      // нужно приведение типов!

        System.out.println(" i и b: " + i + " " + b);
    }
}
