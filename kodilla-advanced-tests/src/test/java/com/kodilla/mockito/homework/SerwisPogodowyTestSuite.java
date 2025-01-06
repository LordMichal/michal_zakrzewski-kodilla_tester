package com.kodilla.mockito.homework;

import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SerwisPogodowyTestSuite {
    SerwisPogodowy serwis;
    Client client;
    Notification notification;
    String location;

    @BeforeEach
    void setUp() {
        serwis = new SerwisPogodowy();
        client = mock(Client.class);
        notification = mock(Notification.class);
        location = "Legnica";
    }

    @Test
    public void client1() { //zapisuje się dostaje powoadomienia
        serwis.subs(client, location);
        serwis.sendAlarm(notification, location);

        verify(client).receive(notification);
    }

    @Test
    public void client2() { //nie zapsiany nie dostaje powiadomień
        serwis.subs(client, location);

        verify(client, never()).receive(notification);
    }

    @Test
    public void client3() {// Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
        serwis.subs(client, location);
        serwis.unsubs(client, location);
        serwis.sendAlarm(notification, location);

        verify(client, never()).receive(notification);
    }

    @Test //
    public void client4() { //Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
        Client seckondClient = mock(Client.class);
        serwis.subs(client, location);
        serwis.subs(seckondClient, location);
        serwis.sendAlarm(notification, location);

        verify(client).receive(notification);
        verify(seckondClient).receive(notification);
    }

    @Test
    public void client5() { //Możliwość wysyłki powiadomienia do wszystkich.
        Client secondClient = mock(Client.class);
        serwis.subs(client, "Location1");
        serwis.subs(secondClient, "Location2");
        serwis.sendAlarmToAll(notification);

        verify(client).receive(notification);
        verify(secondClient).receive(notification);
    }
    @Test
    public void client6(){ //Możliwość skasowania danej lokalizacji.
        serwis.subs(client, location);
        serwis.deleteLokation(location);
        serwis.sendAlarm(notification, location);

        verify(client, never()).receive(notification);
    }
}

