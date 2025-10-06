package serverPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serveur = new ServerSocket(1234);
		System.out.println("Je suis un serveur en attente la connexion d'un client ");
		
		Socket socket = serveur.accept();
		System.out.println("un client est connecté");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String text = reader.readLine();
		System.out.println("Le message reçu est : " + text);
		
		socket.close();
		serveur.close();
		System.out.println("déconnécté");
	}

}
