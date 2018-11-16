package readfile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class tryCatchTest {
	public static String readFile(String name) {
		StringBuilder builder = new StringBuilder();
		//delete try catch & use (abstract way) throws FileNotFoundException 
			try {
				Scanner scanner = new Scanner(new FileInputStream(name));
				while(scanner.hasNext()) {
					builder.append(scanner.nextLine());
					builder.append("\n");
				}
			}catch(IOException | EOFException | ClassCastException e) {
				e.printStackTrace();
			}
		
		return builder.toString();
	}
}
