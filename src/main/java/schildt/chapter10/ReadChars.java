package schildt.chapter10;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main (String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        // Cоздание класса BufferedRead связанного с потоком System.In
        System.out.println("Введите символы: окончание ввода - символ точки");

        // считывание символов
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
