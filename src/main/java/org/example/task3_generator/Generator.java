package org.example.task3_generator;

public class Generator {

    protected String passAlphabet = "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789" +
            "!@#$%^&*()_+-=[]{}|;':,./<>?";

    protected void generate(int lenght) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lenght; i++) {
                sb.append(passAlphabet.charAt((int) (Math.random() * passAlphabet.length())));
            }
            System.out.println(sb.toString());
    }
}
