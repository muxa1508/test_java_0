package org.example.task2;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    protected Scanner scanner;
    protected Input inputScanner;
    protected Courses courses;
    protected Map<CoursesName, Float> calculatedMap;

    protected Menu(Scanner scanner, Input inputScanner, Courses courses) {
        this.scanner = scanner;
        this.inputScanner = inputScanner;
        this.courses = courses;
    }

    protected void mainMenu(String input) {
        input = inputScanner.input(scanner);
        if (input != null) {
            switch (input) {
                case "1":
                    System.out.println("Изменение курса");
                    coursesMenu(input);
                    System.out.println("Новые курсы валют:" + courses);
                    break;
                case "2":
                    System.out.println("Конвертация Валюты");
                    convertMenu(input);
                    break;
                case "выход":
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
            courses.getCoursesId().forEach((key, value) -> {
                if ((key.equals(choice)) && key != 0) {
                    System.out.println("Выбранная валюта:" + value.getName());
                    System.out.println("Введите новый курс в виде числа с точкой:");
                    float newCourse = Float.parseFloat(inputScanner.input(scanner));
                    courses.setNewCourse(choice, newCourse);
                    System.out.println("Новый курс:" + courses.getCourseById(choice));
                }
            });
        }
    }

    private void convertMenu(String input) {
        System.out.println("Выберите исходную валюту:");
        courses.getCoursesId().forEach((key, value) -> {
            System.out.println((key + 1) + " - " + value);
        });

        input = inputScanner.input(scanner);
        if (input != null) {
            Currency currency = new Currency(courses);
            int choice = Integer.parseInt(input) - 1;
            courses.getCoursesId().forEach((key, value) -> {
                if ((key.equals(choice))) {
                    System.out.println("Выбранная валюта:" + courses.getCourseById(choice)+ " - " + value.getName());
                    System.out.println("Введите количество иходной валюты");
                    float newValue = Float.parseFloat(inputScanner.input(scanner));
                    currency.calculate(choice , newValue);
                }
            });

            currency.print(choice);
        }
    }
}
