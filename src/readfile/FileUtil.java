package readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();
		Scanner scanner = null;
		//delete try catch & use (abstract way) throws FileNotFoundException 
			try {
				scanner = new Scanner(new FileInputStream(name));
				while(scanner.hasNext()) {
					builder.append(scanner.nextLine());
					builder.append("\n");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;	//because when not in cmd interface, U need ues throw to show the exception
			}finally {
				if (scanner != null) {
					scanner.close();
				}
			}
		
		return builder.toString();
	}
}
