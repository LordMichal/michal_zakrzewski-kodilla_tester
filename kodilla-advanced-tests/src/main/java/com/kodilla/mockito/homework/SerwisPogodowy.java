package com.kodilla.mockito.homework;
import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SerwisPogodowy {
    private final Map<Client, Set<String>> clientSubs = new HashMap<>();
    private final Map<String, Set<String>> locationSubs = new HashMap<>();

    //    public void subs (Client client, String location){
//        clientSubs.computeIfAbsent(client, k -> new HashSet<>()).add(location);
    public void subs(String userId, String location) {
        locationSubs.computeIfAbsent(location, k -> new HashSet<>()).add(userId);
    }

    public void unsubs(Client client, String location) {
        if (clientSubs.containsKey(client)) {
            clientSubs.get(client).remove(location);
        }
    }

    public void unSubsForAll(Client client) {
        clientSubs.remove(client);
    }

    public void sendAlarm(Notification notification, String location) {
        Set<String> userIds = locationSubs.get(location);
        if (userIds != null) {
            for (String userId : userIds) ;
        }
    }



    public void sendAlarmToAll(Notification notification, String location) {
        for (Map.Entry<String, Set<String>> entry : locationSubs.entrySet()) {
            if (entry.getValue().contains(locationSubs));

        }
    }


    public void deleteLokation (String location){
        for( Set<String> lokations : clientSubs.values()){
            lokations.remove(location);
        }
    }
}
