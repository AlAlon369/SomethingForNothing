package schildt.chapter9;

public class Rethrow {
    public static void genException() {
        // Длинна массива numer превышает длину массива denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // Перехват исключения
                System.out.println("Попытка деления на нуль");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // Перехват исключения
                System.out.println("Соотвествующий элемент не найден");
                throw exc;   // повторно сгенерировать исключение
            }
        }
    }
}

   class RethrowDemo {
       public static void main(String[] args) {
           try {
               Rethrow.genException();
           } catch (ArrayIndexOutOfBoundsException exc) {   // Перехват повторно сгенерированного исключения
               // Повторный перехват исключения
               System.out.println("Фатальная ошибка - " + "выполнение программы прервано!");
           }
       }
   }