package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public String printresponsibilities(){
        return " Obowiązki:" + responsibilities;
    }
//    public Object printresponsibilities(){
//        System.out.println("Obowiązki " + responsibilities);
//        return null;
//    }
}

