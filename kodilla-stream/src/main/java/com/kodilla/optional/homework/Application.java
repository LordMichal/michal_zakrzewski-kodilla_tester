package com.kodilla.optional.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alicja");
        Teacher teacher2 = new Teacher("Joanna");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Michal", teacher1));
        students.add(new Student("Kacper", teacher1));
        students.add(new Student("Jakub", teacher2));
        students.add(new Student("Dawid", teacher2));
        students.add(new Student("Tomasz", teacher2));
        students.add(new Student("Daniel", null));
        students.add(new Student("Kuba", null));
        students.add(new Student("Filip", teacher2));
        List<String> studentAndTeacher = getStudentAndTeacher(students);
        studentAndTeacher.forEach(System.out::println);
    }
    public static List<String> getStudentAndTeacher(List<Student> students){
        List<String> pairs = new ArrayList<>();
        for (Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            pairs.add("Uczen: " + student.getName() + ", Nauczyciel: " + student.getTeacherName());
        }
        return pairs;
    }
}
