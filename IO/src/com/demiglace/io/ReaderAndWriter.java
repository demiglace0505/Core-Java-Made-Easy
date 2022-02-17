package com.demiglace.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader(
				"C:\\Users\\ChristianCruz\\Documents\\Christian\\projects\\Core-Java-Made-Easy\\IO\\file.txt");
		fw = new FileWriter(
				"C:\\Users\\ChristianCruz\\Documents\\Christian\\projects\\Core-Java-Made-Easy\\IO\\newfile.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fr.close();
		fw.close();
	}
}
