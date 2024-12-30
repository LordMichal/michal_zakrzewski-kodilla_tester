package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    @Test
    public void testStudentAndTecherIsTrue() {
        //Given
        Teacher teacher = new Teacher("Joanna");
        Student student = new Student("Filip", teacher);
        List<Student> students = Arrays.asList(student);

        //When
        List<String> result = Application.getStudentAndTeacher(students);

        //Then
        assertEquals(1, result.size());
        assertEquals("Uczen: Filip, Nauczyciel: Joanna", result.get(0));
    }

    @Test
    public void testStudentAndTecherIsFalse(){
        //Given

        Student student = new Student("Tomasz", null);
        List<Student> students = Arrays.asList(student);

        //When
        List<String> result = Application.getStudentAndTeacher(students);

        //Then
        assertEquals(1, result.size());
        assertEquals("Uczen: Tomasz, Nauczyciel: <undefined>", result.get(0));
    }
}
