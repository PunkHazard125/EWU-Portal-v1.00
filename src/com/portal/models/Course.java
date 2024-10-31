package com.portal.models;

public class Course {

    private final String code;
    private final int section;
    private final double credit;
    private final String time_slot;

    public Course(String code, int section, double credit, String time_slot) {

        this.code = code;
        this.section = section;
        this.credit = credit;
        this.time_slot = time_slot;

    }

    public String get_code() {

        return code;

    }

    public int get_section() {

        return section;

    }

    public double get_credit() {

        return credit;

    }

    public String get_time_slot() {

        return time_slot;

    }
}
