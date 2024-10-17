package org.example.task2_converter;


import java.util.Scanner;

public class Input {

    protected String input(Scanner scanner) {
        String input = scanner.nextLine();

        if (input.equals("выход")) {
            System.exit(0);
        }
        try {
            Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
        return input;
    }
}
