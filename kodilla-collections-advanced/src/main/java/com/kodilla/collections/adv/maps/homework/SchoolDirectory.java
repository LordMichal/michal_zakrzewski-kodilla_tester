package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> goingToo = new HashMap<>();

        Principal principalErnest = new Principal("Ernest", "Styczeń");
        Principal principalTobiasz = new Principal("Tobias", "luty");
        Principal principalAdam = new Principal("Adam", "Marzec");
        Principal principalMichal = new Principal("Michal", "Kwiecein");

        School school1st = new School(List.of(12,65,65,65,68,32,13));
        School school2nd = new School(List.of(23,23,43,56,2,22));
        School school3th = new School(List.of(65, 654, 55,63,123));

        goingToo.put(school1st, principalAdam);
        goingToo.put(school2nd, principalErnest);
        goingToo.put(school3th, principalTobiasz);
        goingToo.put(school2nd, principalMichal);

        for (Map.Entry<School,Principal> entry :goingToo.entrySet()){
            System.out.println("Szkola: " + entry.getKey() + ", Dyro: " + entry.getValue() + ", ma ucznow: " + entry.getKey().getTotalNumberOfStudents());
        }


    }
}
