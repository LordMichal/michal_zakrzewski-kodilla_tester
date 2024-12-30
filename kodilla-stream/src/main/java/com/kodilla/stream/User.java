package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPost;
    private String group;

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    public User(String username, int age, int numberOfPost, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && numberOfPost == user.numberOfPost && Objects.equals(username, user.username) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPost, group);
    }
}
