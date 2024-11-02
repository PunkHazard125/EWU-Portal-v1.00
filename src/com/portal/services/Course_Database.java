package com.portal.services;

import java.util.*;
import com.portal.models.Course;

public class Course_Database {

    private static ArrayList<Course> course_list = new ArrayList<>();
    static Random random = new Random();

    public Course_Database() {

        course_list.add(new Course("CSE101", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE102", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE201", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE202", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE301", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE302", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE401", random.nextInt(30) + 1, 4.5, "MW", "CSE"));
        course_list.add(new Course("CSE402", random.nextInt(30) + 1, 4.5, "MW", "CSE"));

        course_list.add(new Course("EEE101", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE102", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE201", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE202", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE301", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE302", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE401", random.nextInt(30) + 1, 4, "ST", "EEE"));
        course_list.add(new Course("EEE402", random.nextInt(30) + 1, 4, "ST", "EEE"));

        course_list.add(new Course("MAT101", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT102", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT201", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT202", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT301", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT302", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT401", random.nextInt(30) + 1, 3, "SR", "MAT"));
        course_list.add(new Course("MAT402", random.nextInt(30) + 1, 3, "SR", "MAT"));

        course_list.add(new Course("MKT101", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT102", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT201", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT202", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT301", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT302", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT401", random.nextInt(30) + 1, 3, "TR", "MKT"));
        course_list.add(new Course("MKT402", random.nextInt(30) + 1, 3, "TR", "MKT"));

    }
}
