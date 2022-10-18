package schildt.chapter9;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = { 'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if(i == 0)
                    result = a / b;   // Генерирование исключения ArithmeticException
                else
                    chrs[5] = 'X';    // Генерирование исключения ArrayIndexOutOfBoundsException
            }

            // В этой инструкции catch организуется перехват обоих исключений
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное исключение: " + e);
            }
        }
        System.out.println("После группового перехватчика исключений");

    }
}
