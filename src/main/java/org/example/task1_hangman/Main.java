package org.example.task1_hangman;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода из программы введите " + '\"' + "выход" + '\"' + '\n' +
                "Для продолжения нажмите Enter");
        Input inputScanner = new Input();
        String input;
        input = inputScanner.input(scanner);
        boolean exit;
        while (true) {
            exit = inputScanner.isExit();
            WordChoice wordChoice = new WordChoice();
            WordCheck wordCheck = new WordCheck();
            String securedWord = null;

            if (exit) {
                break;
            }
            String word = wordChoice.getWord();

//            System.out.println(word);
            int count = 0;
            wordCheck.createMaskedWord(word);


            while (count < 6) {
                System.out.println("_________");
                securedWord = wordCheck.getMaskedWord();
                System.out.println(securedWord + " Осталось жизней: " + (6-count));

                if (!inputScanner.getInputList().isEmpty()) {
                    System.out.println("Вы ранее вводили следующие буквы:" + '\n' +
                            inputScanner.getInputList().toString());
                }

                System.out.println("Введите букву");
                input = inputScanner.input(scanner);
                exit = inputScanner.isExit();
                if (exit) {
                    break;
                }
                wordCheck.checkWord(securedWord, input);

                count = wordCheck.getCounter();

                if (wordCheck.winCheck()) {
                    System.out.println("Вы выиграли ദ്ദി( • ᴗ - ) ✧");
                    break;
                }
                if (count == 6) {
                    System.out.println("Вы проиграли ¯\\_(ツ)_/¯");
                }
            }
            System.out.println("Игра закончена");
            if (exit) {
                break;
            }

            System.out.println("Введите " + '\"' + "выход" + '\"' +
                    " для выхода из программы или нажмите Enter для повторной попытки");
            inputScanner.inputListClear();
            input = inputScanner.input(scanner);
            exit = inputScanner.isExit();
            if (exit) {
                break;
            }
        }
    }
}
