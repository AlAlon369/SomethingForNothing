package schildt.chapter5.array;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Программе передано " + args.length + " аргумента командной строки. ");

        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + " ]:  " + args[i]);
    }
}

/*
   Допустим программа CLDemo была запущена из командой строки следующим образом:
   java CLDemo one two three
      Тогда результат её выполения будет следующим.
      Программе передано 3 аргумента командной строки.
    Список аргументов:
    arg[0]: one
    arg[1]: two
    arg[2]: three

 Первый аргумент содержится в строке, хранящейся в элементе массива с индексом 0
 */