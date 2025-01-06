package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;
    public String getName(){
        return name;
    }
    public Student( String name, Teacher teacher){
        this.name = name;
        this.teacher =  teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public String getTeacherName() {
        return Optional.ofNullable(teacher)
                .map(Teacher::getName)
                .orElse("<undefined>");
    }
}
