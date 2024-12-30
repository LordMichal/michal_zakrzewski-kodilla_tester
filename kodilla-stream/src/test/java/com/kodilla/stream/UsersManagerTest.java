package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {


    @Test
    public void testFilterChemistGroupUsernames() {
        //Given
        List<User> users = UsersRepository.getUsersList();

        //When
        List<String> chemistUserNames = UsersManager.filterChemistGroupUserNames();

        //Then
        assertNotNull(chemistUserNames);
        assertFalse(chemistUserNames.isEmpty());
        assertEquals(2, chemistUserNames.size());
        assertTrue(chemistUserNames.contains("Walter White"));
        assertTrue(chemistUserNames.contains("Gale Boetticher"));
    }

    @Test
    public void testGetUsersOlderThan() {
        //Given
        int ageLimit = 35;

        //When
        List<User> userOlderThanLimit = UsersManager.getUserOlderThan(ageLimit);

        //Then
        assertNotNull(userOlderThanLimit);
        assertFalse(userOlderThanLimit.isEmpty());
        for (User user : userOlderThanLimit) {
            assertTrue(user.getAge() > ageLimit);
        }
     }
}