package org.example.task2_converter;

import java.util.HashMap;
import java.util.Map;

public class Courses {


    protected float RUB = 1.0f;
    protected float USD = 0.010282f;
    protected float EUR = 0.009426f;
    protected float CNY = 0.073574f;
    protected float KZT = 5.01f;
    protected float GPB = 0.007852f;

    protected Map<CoursesName, Float> courses = new HashMap<>();
    protected Map<Integer, CoursesName> coursesId = new HashMap<>();



    protected void fillMaps() {
        courses.put(CoursesName.RUB, RUB);
        courses.put(CoursesName.USD, USD);
        courses.put(CoursesName.EUR, EUR);
        courses.put(CoursesName.CNY, CNY);
        courses.put(CoursesName.KZT, KZT);
        courses.put(CoursesName.GPB, GPB);

        coursesId.put(0, CoursesName.RUB);
        coursesId.put(1, CoursesName.USD);
        coursesId.put(2, CoursesName.EUR);
        coursesId.put(3, CoursesName.CNY);
        coursesId.put(4, CoursesName.KZT);
        coursesId.put(5, CoursesName.GPB);

    }

    protected void setNewCourse(int id, float newCourse) {
                courses.replace(coursesId.get(id), newCourse);
        }


    protected float getCourseById( int id ) {
        return courses.get(coursesId.get(id));
    }


    protected Map<CoursesName, Float> getCourses() {
        return courses;
    }

    protected Map<Integer, CoursesName> getCoursesId() {
        return coursesId;
    }

    @Override
    public String toString() {

        return "Евро к Рублю" + '\t' + courses.get(CoursesName.EUR) + '\n' +
                "Доллар к Рублю" + '\t' + courses.get(CoursesName.USD)+ '\n' +
                "Юань к Рублю" + '\t' + courses.get(CoursesName.CNY)+ '\n' +
                "Тенге к Рублю" + '\t' + courses.get(CoursesName.KZT)+ '\n' +
                "Фунт к Рублю" + '\t' + courses.get(CoursesName.GPB)+ '\n';
    }
}
