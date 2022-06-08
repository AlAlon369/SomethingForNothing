public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0;     // выносим инициализацию за пределы цикла
        for (; i < 10; ) {    // из определения цикла исключено инициализирующее выражение
            System.out.println("Проход #" + i);
            i++; // инкрементирование переменной цикла
        }
    }
}
