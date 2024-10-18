package org.example.task2_converter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input inputScanner = new Input();
        Courses courses = new Courses();
        courses.fillMaps();
        String input;

        while (true) {
            System.out.println("Для выхода из программы введите " + '\"' + "выход" + '\"' + '\n' +
                    "Для продолжения нажмите Enter");

            inputScanner.input(scanner);

            System.out.println(courses);

            System.out.println("Выберите действие:" + '\n' +
                    "1. Ввести курс валюты" + '\n' +
                    "2. Конвертировать валюту" + '\n');

            Menu menu = new Menu(scanner, inputScanner, courses);

            input = inputScanner.input(scanner);
            menu.mainMenu(input);


        }

    }
}