package org.example.task1_hangman;

public class WordChoiceConstant {

    protected String DICTIONARY = "дражирование фотохимия хрустальность драница егермейстер " +
            "фактограф антиген невручение источниковед кабина фотоэкспонометр дисгармония " +
            "шпицрутен преимущество нагрев экстерн автосалон штурм путеподъёмник электрогитара";


    protected String getWord() {
        String[] words = DICTIONARY.split(" ");
        String word = words[(int) (Math.random() * words.length)];

        return word;
    }
}
