package org.example.task2;


import java.util.Scanner;

public class Input {

    protected boolean exit = false;


    protected String input(Scanner scanner) {
        String input = scanner.nextLine();

        if (input.equals("выход")) {
            exit = true;
            return null;
        }
        return input;
    }


    protected boolean isExit() {
        return exit;
    }

}
