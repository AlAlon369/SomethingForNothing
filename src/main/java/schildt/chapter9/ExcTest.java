package schildt.chapter9;

// Использование методов класса Throwable
 class ExcTest {
    // Генерация исключения
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        // Генерация исключения в связи с выходом за пределы массива
        nums[7] = 10;         // Здесь генерируется исключение
        System.out.println("Эта строка не будет отображаться");
    }
}
        class UseThrowableMethods {
            public static void main(String[] args) {
                try {
                    ExcTest.genException();
                }
                catch (ArrayIndexOutOfBoundsException exc) {
                    // перехват исключения
                    System.out.println("Стандартное сообщение: ");
                    System.out.println(exc);
                    System.out.println("\nСтек вызовов: ");
                }
                System.out.println("После инструкции catch");

            }
        }