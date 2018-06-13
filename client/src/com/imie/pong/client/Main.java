package com.imie.pong.client;

import com.imie.pong.server.Server;
import com.imie.pong.service.SocketManager;

public class Main {

	public static void main(String[] args) {

		String host = "127.0.0.1";
		int port = 2345;
		
		Server ts = new Server(host, port);
		ts.open();

		System.out.println("Serveur initialisé.");

		Thread t = new Thread(new SocketManager(host, port));
		t.start();
	}
}
