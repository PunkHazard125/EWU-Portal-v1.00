package com.portal.models;

public class Course {

    private final String code;
    private final int capacity;
    private final double credit;
    private final String time_slot;
    private final String dept;

    public Course(String code, int capacity, double credit, String time_slot, String dept) {

        this.code = code;
        this.capacity = capacity;
        this.credit = credit;
        this.time_slot = time_slot;
        this.dept = dept;
    }

    public String get_code() {

        return code;

    }

    public int get_capacity() {

        return capacity;

    }

    public double get_credit() {

        return credit;

    }

    public String get_time_slot() {

        return time_slot;

    }

    public String get_dept() {

        return dept;

    }
}
