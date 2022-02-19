package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("Waiting for the client to connect");
			Socket socket = serverSocket.accept();
			System.out.println("Connection Established");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String data = dis.readUTF();
			System.out.println("Message received" + data);
			dis.close();
			serverSocket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
