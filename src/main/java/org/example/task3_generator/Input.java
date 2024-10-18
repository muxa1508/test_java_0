package org.example.task3_generator;

import java.util.Scanner;

public class Input {

    protected int input(Scanner scanner) {
        String input = scanner.nextLine();

        if (input.equals("выход")) {
            System.exit(0);
        }
        if (input.equals("")) {
            return 0;
        }
        int intInput =0;
        try {
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Введите целое число");
        }
        if (8 <= intInput && intInput <= 12) {
            return intInput;
        } else {
            System.out.println("Вы ввели число вне диапазона от 8 до 12");
        }
        return 0;
    }
}
