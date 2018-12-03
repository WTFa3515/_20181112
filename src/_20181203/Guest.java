package _20181203;

import java.util.*;
import static java.lang.System.out;

public class Guest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		collecNameTo(names);
		out.println("訪客名單：");
		printUpperCase(names);
	}

	private static void printUpperCase(List<String> names) {
		// TODO Auto-generated method stub
		for(String name : names) {
			out.println(name.toUpperCase());
		}
	}

	private static void collecNameTo(List<String> names) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true){
			out.println("訪客名單(input quit to quit)：");
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}else {
				names.add(name);
			}
		}
	}
	
}
