package readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();
		
		//delete try catch & use (abstract way) throws FileNotFoundException 
			try(Scanner scanner = new Scanner(new FileInputStream(name)))
			{//After JDK7, add a new grammar "try-with-resources" to reduce finally
				while(scanner.hasNext()) {
					builder.append(scanner.nextLine());
					builder.append("\n");
				}
			} catch (FileNotFoundException ex) {//e->ex throw Exception before close file 
				// TODO Auto-generated catch block
				ex.printStackTrace();
				throw ex;	//because when not in cmd interface, U need ues throw to show the exception
			}		
		return builder.toString();
	}
}
