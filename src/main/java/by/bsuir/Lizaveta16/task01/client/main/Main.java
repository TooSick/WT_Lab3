package by.bsuir.Lizaveta16.task01.client.main;

import by.bsuir.Lizaveta16.task01.client.service.ClientLogic;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClientLogic clientLogic = new ClientLogic();
        clientLogic.startClient();
    }
}
