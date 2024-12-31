package com.kodilla.stream.homework;
import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import static java.util.Locale.filter;

public class ForumStats {
    public static double getAveragePostForUnder40(List<User> users){
        return users.stream()
        .filter(user -> user.getAge() < 40)
            .mapToInt(User::getNumberOfPost)
            .average()
            .orElse(0);
    }

    public static double getAveragePostForOver40 (List<User> users){
        return users.stream()
                .filter(user -> user.getAge() >=40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }
    public static void main(String[] args){
        List <User> users = UsersRepository.getUsersList();
        double avgPostUnder40 = getAveragePostForUnder40(users);
        double avgPostOver40 = getAveragePostForOver40(users);

        System.out.println("Srednia liczba postow dla uzytkownikow ponizej 40 roku zycia to " + avgPostUnder40);
        System.out.println("Srednai liczba postow dla uzutkwonikow powyzej 40 roku zycia to " + avgPostOver40);
    }
}
