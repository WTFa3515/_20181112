package _20181203;
import java.util.*;
import static java.lang.System.out;

public class DemoLinkedlist {
	//public use for SimpleLinkedList : add, get, size
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList<String> names = new SimpleLinkedList<>();
		collecNameTo(names);
		out.println("�X�ȦW��G");
		printUpperCase(names);
	}

	private static void printUpperCase(SimpleLinkedList<String> names) {
		// TODO Auto-generated method stub
		for(int i = 0; i < names.size(); i++) {
			out.println(names.get(i).toUpperCase());
		}
	}

	private static void collecNameTo(SimpleLinkedList<String> names) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true){
			out.println("�X�ȦW��(input quit to quit)�G");
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}else {
				names.add(name);
			}
		}
	}	
}

