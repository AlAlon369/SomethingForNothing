package Codewars;

public class kata61 {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("David Mendieta"));
    }
       // Написать функцию, для преобразования имени в инициалы.
       // метод должен возвращать две заглавные буквы с точкой, разделяюей их.

       // План
       // Сплит строки, получем массив.
       // Обращаясь к имени, берем 0 индекс.
       // Далее обращаемся к фамилии, попробовать substring();
       // add "."; (не знаю как)
       // Если буквы будут не заглавными использовать метод toUpperCase();
       // Если будут проблемы с тестами, из-за пробелов спереди и сзади строки, использовать trim();


    public static String abbrevName(String name) {
        String[] initials = name.split(" ");
        String firstName = initials[0];
        String inicialFirstName = firstName.substring(0, 1);
        String lastName = initials[1];
        String inicialLastName = lastName.substring(0,1);
        String result = inicialFirstName + "." + inicialLastName;


        return result.toUpperCase();
     }
}
