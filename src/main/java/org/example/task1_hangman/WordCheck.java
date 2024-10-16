package org.example.task1_hangman;


public class WordCheck {

    protected String[] maskedWordArray;
    protected String[] wordArray;
    protected int counter = 0;
    protected String maskedWord;

    protected HangmanPrint hangmanPrint = new HangmanPrint();

    protected void createMaskedWord(String word) {
        maskedWord = "";
        wordArray = word.split("");
        maskedWordArray = new String[wordArray.length];
        for (int i = 0; i < word.length(); i++) {
            maskedWord += "*";
            maskedWordArray[i] = "*";
        }
    }

    protected void checkWord(String word, String character) {

        boolean found = false;
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equals(character)) {
                maskedWordArray[i] = character;
                found = true;
            }
        }
        if (character.length() > 1) {
            System.out.println("Вводите буквы по одной");
        } else if (!found && !character.isEmpty()) {
            counter++;
            found = false;
            System.out.println("В слове нет такой буквы" + '\n' +
                    hangmanPrint.printHangman(counter));
        }
        updateMaskedWord();

    }

    protected int getCounter() {
        return counter;
    }

    protected String getMaskedWord() {
        return maskedWord;
    }

    protected String updateMaskedWord() {
        maskedWord = String.join("", maskedWordArray);
        return maskedWord;
    }

    protected boolean winCheck() {
        int count = 0;
        for (int i = 0; i < maskedWordArray.length; i++) {
            if (maskedWordArray[i].equals("*")) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
