package by.bsuir.Lizaveta16.task01.server.main;

import by.bsuir.Lizaveta16.task01.server.service.ServerLogic;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerLogic serverLogic = new ServerLogic();
		serverLogic.startConnection();
	}

}
