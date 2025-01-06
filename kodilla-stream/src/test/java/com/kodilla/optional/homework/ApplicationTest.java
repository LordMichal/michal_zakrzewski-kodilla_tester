package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
//    @Test
//    public void testStudentAndTecherIsTrue() {
//        //Given
//        Teacher teacher = new Teacher("Joanna");
//        Student student = new Student("Filip", teacher);
//        List<Student> students = Arrays.asList(student);
//
//        //When
//        List<String> result = Application.getStudentAndTeacher(students);
//
//        //Then
//        assertEquals(1, result.size());
//    }
//
//    @Test
//    public void testStudentAndTecherIsFalse() {
//        //Given
//
//        Student student = new Student("Tomasz", null);
//        List<Student> students = Arrays.asList(student);
//
//        //When
//        List<String> result = Application.getStudentAndTeacher(students);
//
//        //Then
//        assertEquals(1, result.size());
//    }
//}

    @Test
    void testStudentAndTecherIsTrue() {
        // Given
        Teacher teacher1 = new Teacher("Alicja");
        Teacher teacher2 = new Teacher("Joanna");

        List<Student> students = List.of(
                new Student("Michal", teacher1),
                new Student("Kacper", teacher1),
                new Student("Jakub", teacher2),
                new Student("Dawid", teacher2),
                new Student("Tomasz", null),
                new Student("Daniel", null),
                new Student("Kuba", null),
                new Student("Filip", teacher2)
        );

        // When
        List<String> result = Application.getStudentAndTeacher(students);

        // Then
        assertEquals(8, result.size());
        assertTrue(result.contains("Uczen: Michal, Nauczyciel: Alicja"));
        assertTrue(result.contains("Uczen: Kacper, Nauczyciel: Alicja"));
        assertTrue(result.contains("Uczen: Jakub, Nauczyciel: Joanna"));
        assertTrue(result.contains("Uczen: Dawid, Nauczyciel: Joanna"));
        assertTrue(result.contains("Uczen: Tomasz, Nauczyciel: <undefined>"));
        assertTrue(result.contains("Uczen: Daniel, Nauczyciel: <undefined>"));
        assertTrue(result.contains("Uczen: Kuba, Nauczyciel: <undefined>"));
        assertTrue(result.contains("Uczen: Filip, Nauczyciel: Joanna"));
    }
    @Test
    public void testStudentAndTecherIsFalse() {
        Teacher teacher1 = new Teacher("Alicja");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Michal", teacher1));
        students.add(new Student("Kacper", null));
        students.add(new Student("Jakub", teacher1));
        students.add(new Student("Dawid", null));

        List<String> result = Application.getStudentAndTeacher(students);

        assertEquals(4, result.size());
        assertEquals("Uczen: Michal, Nauczyciel: Alicja", result.get(0));
        assertEquals("Uczen: Kacper, Nauczyciel: <undefined>", result.get(1));
        assertEquals("Uczen: Jakub, Nauczyciel: Alicja", result.get(2));
        assertEquals("Uczen: Dawid, Nauczyciel: <undefined>", result.get(3));
    }
}
