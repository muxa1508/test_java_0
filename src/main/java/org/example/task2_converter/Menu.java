package org.example.task2_converter;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    protected Scanner scanner;
    protected Input inputScanner;
    protected Courses courses;


    protected Menu(Scanner scanner, Input inputScanner, Courses courses) {
        this.scanner = scanner;
        this.inputScanner = inputScanner;
        this.courses = courses;
    }

    protected void mainMenu(String input) {
        if (input != null) {
            switch (input) {
                case "1":
                    System.out.println("Изменение курса");
                    coursesMenu(input);
                    System.out.println("Новые курсы валют:" + '\n' + courses);
                    break;
                case "2":
                    System.out.println("Конвертация Валюты");
                    convertMenu(input);
                    break;
            }
        }
    }

    private void coursesMenu(String input) {
        System.out.println("Выберите валюту для изменения курса относительно Рубля");

        courses.getCoursesId().forEach((key, value) -> {
            if (key != 0) {
                System.out.println(key + " - " + value);
            }
        });

        input = inputScanner.input(scanner);
        if (input != null) {
            int choice = Integer.parseInt(input);
            if ((choice >= 0) && (choice < courses.getCoursesId().size())) {
                courses.getCoursesId().forEach((key, value) -> {
                    if ((key.equals(choice)) && key != 0) {
                        System.out.println("Введите новый курс в виде числа с точкой:");
                        float newCourse = 0;
                        try {
                            newCourse = Float.parseFloat(inputScanner.input(scanner));
                        } catch (NumberFormatException e) {
                        }
                        courses.setNewCourse(choice, newCourse);
                        System.out.println("Новый курс:" + courses.getCourseById(choice));
                    }
                });
            } else {
                System.out.println("Некоректный ввод");
            }
        }
    }

    private void convertMenu(String input) {
        System.out.println("Выберите исходную валюту:");
        courses.getCoursesId().forEach((key, value) -> {
            System.out.println((key + 1) + " - " + value);
        });

        input = inputScanner.input(scanner);
        Currency currency = new Currency(courses, new HashMap<>());
        if (input != null) {
            int choice = Integer.parseInt(input) - 1;

            if ((choice >= 0) && (choice < courses.getCoursesId().size())) {
                courses.getCoursesId().forEach((key, value) -> {
                    if ((key.equals(choice))) {
                        System.out.println("Введите количество иcходной валюты");
                        float newValue = 0;
                        try {
                            newValue = Float.parseFloat(inputScanner.input(scanner));
                        } catch (NumberFormatException e) {
                        }
                        currency.calculate(choice, newValue);
                    }
                });
                currency.print(choice);
            } else {
                System.out.println("Некоректный ввод");
            }
        }
    }
}
