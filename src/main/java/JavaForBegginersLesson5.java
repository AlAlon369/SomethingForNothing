public class JavaForBegginersLesson5 {
    public static void main(String[] args) {
        // в первом блоке у нас декларируется переменная счётчик, которая будет
        // изменятся с каждой иттерацией этого цикла. (int i)
        // второй блок это блок условия, до каких пор у нас будет выполняться цикл (i<=10)
        // третий блок это блок изменения переменной i, какое будет действие выполнятся
        // каждую иттерацию этого цикла, что мы будет производить с переменной i, к примеру мы будем увеличивать
        // переменную i на 1 еденицу (i+1) также можно написать i++        i++ = i+1 (true)

        for (int i = 1; i <= 10; i++) {                        // условия можно поделить на три блока.
            System.out.println("Олег приседает " + i + " раз ");
        }


        // итог, как работает цикл for;
        // при первой итерации i = 0
        // итерация произойдет если выполнится условие i >= 10
        // после итерации i + 5,
        for (int i = 60; i >= 0; i = i - 1) {
            System.out.println("оставшееся время до взрыва" + i);    // пример обратного порядка цикла for.

        }
    }
}
