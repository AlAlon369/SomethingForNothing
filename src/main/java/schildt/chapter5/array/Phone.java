package schildt.chapter5.array;

public class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"John", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        // Для того чтобы воспользоваться программой,
        // Ей нужно передать один аргумент командной строки
        if (args.length != 1)    // <---   Для выполенения программы нужен как минимум один аргумент командной строки
            System.out.println("Использование: Java Phone <имя>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Имя не найдено.");
        }
    }
}

               // Выполнение этой программы может дать например, следующий результат
               // Marry: 555-8976