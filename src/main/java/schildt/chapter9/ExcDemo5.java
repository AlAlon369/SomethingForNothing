package schildt.chapter9;

// Инструкция catch исключения подкласса должны предшествовать исключениям суперкласса
public class ExcDemo5 {
    public static void main(String[] args) {
        // Длинна массива numer превышает длину массива denom
        int number[] = { 4, 8, 17, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < number.length; i++) {
            try  {
                System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {   // Перехват подкласса
                // Перехват исключеням
                System.out.println("Соотвествующий элемент не найден");
            }

            catch (Throwable exc) {   // Перехват сувперкласса
                System.out.println("Возникло исключение");
            }
        }
    }
}
