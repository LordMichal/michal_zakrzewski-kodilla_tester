package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String printResponsibilities() {
        System.out.println(firstName + " pracuje jako " + job.getClass());
        System.out.println(job.printresponsibilities());
        return"" ;
    }
}
