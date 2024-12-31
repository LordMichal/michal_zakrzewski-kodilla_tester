package com.kodilla.stream;

import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForumStats {
    @Test
    public void testgetAveragePostForUnder40(){
        //given
        List<User> users = Arrays.asList(
                new User("1", 22, 1565, "Group"),
                new User("2", 38, 535, "Group")
        );
        //When
        double average = ForumStats.getAveragePostForUnder40(users);
        //then
        assertEquals(1050, average);
    }
    @Test
    public void testgetAveragePostForOver40(){
        //given
        List<User> users = Arrays.asList(
                new User("3", 41, 218, "Group"),
                new User("4", 65, 112, "Group")
        );
        //When
        double average = ForumStats.getAveragePostForOver40(users);

        //then
        assertEquals(165, average);
    }

}
