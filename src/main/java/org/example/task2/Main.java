package org.example.task2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input inputScanner = new Input();
        Courses courses = new Courses();
        courses.fillMaps();
        String input;
        boolean exit = false;


        while (!exit) {
            System.out.println("Для выхода из программы введите " + '\"' + "выход" + '\"' + '\n' +
                    "Для продолжения нажмите Enter");

            input = inputScanner.input(scanner);
            if (inputScanner.isExit()) {
                break;
            }

            System.out.println(courses);

            System.out.println("Выберите действие:" + '\n' +
                    "1. Ввести курс валюты" + '\n' +
                    "2. Конвертировать валюту" + '\n');
            Menu menu = new Menu(scanner, inputScanner, courses);
            menu.mainMenu(input);


        }
    }
}