package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {
	public static void main(String[] args) throws IOException {
		//writing to a file
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Serialize Yourself.");
		System.out.println(path);
		
		//reading contents
		String str = Files.readString(path);
		System.out.println(str);
	}
}
