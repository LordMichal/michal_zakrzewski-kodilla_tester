package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfPrincipalInClass = new ArrayList<>();

    public int getTotalNumberOfStudents() {
        int total = 0;
        for (int principal:numberOfPrincipalInClass){
            total =+ principal;
        }
        return total;
    }
    @Override


    public String toString() {
        return "School{" +
                "numberOfPrincipalInClass=" + numberOfPrincipalInClass +
                '}';
    }
    public School(List<Integer> numberOfPrincipalInClass) {
        this.numberOfPrincipalInClass = new ArrayList<>(numberOfPrincipalInClass);
    }
}
