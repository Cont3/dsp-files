package org.dsp.files.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile2 {

	public static void main(String... args) throws IOException {
		InputStream inputStream = new FileInputStream("arquivo.txt");

		Scanner scanner = new Scanner(inputStream);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}

}
