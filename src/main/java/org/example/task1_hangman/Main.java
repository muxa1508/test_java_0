package org.example.task1_hangman;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода из программы введите " + '\"' + "выход" + '\"' + '\n' +
                "Для продолжения нажмите Enter");
        Input inputScanner = new Input();

        while (true) {
            inputScanner.input(scanner);

//            WordChoiceFile wordChoice = new WordChoiceFile();
            WordChoiceConstant wordChoiceConstant = new WordChoiceConstant();
            WordCheck wordCheck = new WordCheck();
            String securedWord = null;

            String word = wordChoiceConstant.getWord();
//            String word = wordChoice.getWord();

//            System.out.println(word);
            int count = 0;
            wordCheck.createMaskedWord(word);


            while (count < 6) {
                System.out.println("_________");
                securedWord = wordCheck.getMaskedWord();
                System.out.println(securedWord + " Осталось жизней: " + (6 - count));

                if (!inputScanner.getInputList().isEmpty()) {
                    System.out.println("Вы ранее вводили следующие буквы:" + '\n' +
                            inputScanner.getInputList().toString());
                }

                System.out.println("Введите букву");
                String input = inputScanner.input(scanner);

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

            System.out.println("Введите " + '\"' + "выход" + '\"' +
                    " для выхода из программы или нажмите Enter для повторной попытки");
            inputScanner.inputListClear();
        }
    }
}
