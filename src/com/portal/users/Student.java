package com.portal.users;

public class Student {

    public String name;
    public String id;
    public String dept;
    public int year;
    public int semester;

    public String get_name() {

        return name;

    }

    public String get_id() {

        return id;

    }

    public String get_dept() {

        return dept;

    }

    public int get_year() {

        return year;

    }

    public void set_semester(int semester) {

        this.semester = semester;

    }
}
