package org.example.task2;


import java.util.HashMap;
import java.util.Map;


public class Currency {

    protected float value;
    protected Courses courses;
    protected Map<CoursesName, Float> calculatedMap;
    protected String toPrint;


    public Currency(Courses courses) {
        this.courses = courses;
    }

    protected void calculate(int choice, float newValue) {
        Map<CoursesName, Float> calculatedMapLambda = new HashMap();
        courses.getCourses().forEach((key, value) -> {
                calculatedMapLambda.put(key, newValue * value);
        });
        this.calculatedMap = calculatedMapLambda;
    }


    protected void print(int choice) {
        toPrint = "";
        courses.getCoursesId().forEach((key, value) -> {
            if (!key.equals(choice)) {
                String line = value + calculatedMap.get(key).toString();
                toPrint += line + "\n";
            }
        });
    }
}