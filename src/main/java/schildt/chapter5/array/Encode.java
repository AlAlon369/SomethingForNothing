package schildt.chapter5.array;

public class Encode {

    public static void main(String[] args) {
        String msg = "Это просто тест";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // шифровое сообщение
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);    // Построение зашифрованное строки сообщения

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровка собщения

        for (int i = 0; i <msg.length() ; i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key); // Построение дешифрованной строки сообщения

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);


    }
}
