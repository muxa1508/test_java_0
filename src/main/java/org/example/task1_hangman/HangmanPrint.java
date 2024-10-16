package org.example.task1_hangman;

public class HangmanPrint {

    protected String HANGMAN1 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";

    protected String HANGMAN2 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|    |" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";
    ;

    protected String HANGMAN3 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|   /|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";

    protected String HANGMAN4 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|   /|\\" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";

    protected String HANGMAN5 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|   /|\\" + '\n' +
            "|   /" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";

    protected String HANGMAN6 = "_____" + '\n' +
            "|    |" + '\n' +
            "|    0" + '\n' +
            "|   /|\\" + '\n' +
            "|   / \\" + '\n' +
            "|" + '\n' +
            "|" + '\n' +
            "__________";


    protected String printHangman(int count) {
        switch (count) {
            case 1:
                return HANGMAN1;
            case 2:
                return HANGMAN2;
            case 3:
                return HANGMAN3;
            case 4:
                return HANGMAN4;
            case 5:
                return HANGMAN5;
            case 6:
                return HANGMAN6;
        }
        return null;
    }
}
