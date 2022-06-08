public class Empty {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Проход №" + i);   // отсутствует итерационное выражение
            i++; // инкрементирование переменной цикла
        }
    }
}