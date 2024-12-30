package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
        List<String> chemistGroupUsernames = filterChemistGroupUserNames();
        System.out.println(chemistGroupUsernames);
    }
    public static List<String> filterChemistGroupUserNames() {
        List<String> userNames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return userNames;
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
    }
    public static String getUserName(User user){
        return user.getUsername();
    }

    public static List<User> getUserOlderThan(int age){
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
}