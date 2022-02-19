package networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8080);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Serialize yourself");
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
