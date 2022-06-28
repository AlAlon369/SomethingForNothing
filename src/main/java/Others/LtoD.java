package Others;

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;       // авторматическое преобразвание типа long в тип double
        System.out.println("L и D: " + L + " " + D);
    }
}
