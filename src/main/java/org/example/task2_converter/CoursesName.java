package org.example.task2_converter;


public enum CoursesName {

    RUB("Рубль"),
    USD("Доллар"),
    EUR("Евро"),
    CNY("Юань"),
    KZT("Тенге"),
    GPB("Фунт");

    private String name;

    CoursesName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}