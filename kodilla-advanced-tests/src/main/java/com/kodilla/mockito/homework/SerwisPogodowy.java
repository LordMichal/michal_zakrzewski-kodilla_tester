package com.kodilla.mockito.homework;
import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SerwisPogodowy {
    private final Map<Client, Set<String>> clientSubs = new HashMap<>();

    public void subs (Client client, String location){
        clientSubs.computeIfAbsent(client, k -> new HashSet<>()).add(location);
    }

    public void unsubs (Client client, String location){
        if (clientSubs.containsKey(client)) {
            clientSubs.get(client).remove(location);
        }
    }
    public void unSubsForAll(Client client){
        clientSubs.remove(client);
    }
    public void sendAlarm(Notification notification, String location){
        for (Map.Entry<Client, Set<String>> entry: clientSubs.entrySet()){
            if (entry.getValue().contains(location)){
                entry.getKey().receive(notification);
            }
        }
    }

    public void sendAlarmToAll(Notification notification) {
        for (Client client : clientSubs.keySet()) {
            client.receive(notification);
        }
    }

    public void deleteLokation (String location){
        for( Set<String> lokations : clientSubs.values()){
            lokations.remove(location);
        }
    }
}
