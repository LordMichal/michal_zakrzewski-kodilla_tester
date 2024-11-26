package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange(){
        Student student =new Student("Martin");
        student.addPGeografhyGrade(-2);
        student.addPGeografhyGrade(4);
        student.addPGeografhyGrade(8);

        student.addMathGrade(0);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        student.addPhisicsGrade(19);
        student.addPhisicsGrade(3);
        student.addPhisicsGrade(3);

        double geograhyAverage = student.getGeografyAverage();
        double historyAverage = student.getHistoryAverade();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(3.33, geograhyAverage, 0.01);
        assertEquals(3, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(0, physicsAverage, 0.01);
    }


}
