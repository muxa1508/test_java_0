package org.example.task1_hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    protected boolean exit = false;

    protected List<String> inputList = new ArrayList<String>();

    protected String input(Scanner scanner) {
        String input = scanner.nextLine();

        if (input.equals("выход")) {
            exit = true;
            return null;
        }
        exit = false;
        if (!input.equals("") & (input.length() == 1)) {
            inputList.add(input);
        }
        inputList.sort(String.CASE_INSENSITIVE_ORDER);
        return input;
    }

    protected List<String> getInputList() {
        return inputList;
    }

    protected boolean isExit() {
        return exit;
    }

    protected void inputListClear() {
        inputList.clear();
    }
}
