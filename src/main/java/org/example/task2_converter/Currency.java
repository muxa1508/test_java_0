package org.example.task2_converter;


import java.util.Map;


public class Currency {

    protected float value;
    protected Courses courses;
    protected Map<CoursesName, Float> calculatedMap;
    protected String toPrint;


    public Currency(Courses courses, Map<CoursesName, Float> calculatedMap) {
        this.calculatedMap = calculatedMap;
        this.courses = courses;
    }

    protected void calculate(int choice, float newValue) {
        if (newValue != 0) {
            courses.getCourses().forEach((key, value) -> {
                if (choice == 0) {
                    courses.getCoursesId().forEach((key1, value1) -> {
                        if (!key1.equals(choice)) {
                            calculatedMap.put(key, newValue * value);
                        }
                    });
                } else {
                    courses.getCoursesId().forEach((key1, value1) -> {
                        if (!key1.equals(choice)) {
                            calculatedMap.put(key, newValue / courses.getCourseById(choice) * value);
                        }
                    });
                }
            });
        }
    }

    protected void print(int choice) {
        if (!calculatedMap.isEmpty()) {
            toPrint = "";
            courses.getCoursesId().forEach((key, value) -> {
                if (!key.equals(choice)) {
                    String line = value + "\t" + calculatedMap.get(value).toString();
                    toPrint += line + "\n";
                }
            });
            System.out.println(toPrint);
        }
    }
}