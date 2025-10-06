package clientPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("localhost",1234);
		System.out.println("je suis connecté");
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
		writer.println("Bonjour! je suis le client.");
		
		socket.close();
	}

}
