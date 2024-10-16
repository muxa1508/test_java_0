package org.example.task1_hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordChoice {

    private String DICTIONARY = "src/main/resources/dictionary.txt";

    protected String getWord() {
        File file = new File(DICTIONARY);
        try {
            Scanner input = new Scanner(file);
            List<String> words = new ArrayList<>();
            while (input.hasNextLine()) {
                String word = input.nextLine();
                words.add(word);
            }

            int randomIndex = (int) (Math.random() * words.size());
            String word = words.get(randomIndex);

            return word;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



