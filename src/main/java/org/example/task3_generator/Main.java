package org.example.task3_generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input inputScanner = new Input();

        while (true) {
            System.out.println("Для выхода из программы введите " + '\"' + "выход" + '\"' + '\n' +
                    "Для продолжения нажмите Enter");

            inputScanner.input(scanner);

            System.out.println("Введите желаемую длину пароля от 8 до 12 символов");
            int lenght = inputScanner.input(scanner);

            new Generator().generate(lenght);

        }
    }
}