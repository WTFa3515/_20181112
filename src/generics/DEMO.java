package generics;
import java.util.Scanner;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList eggBox = new ArrayList(5); 
		while(true) {
			System.out.print("Please input the number of eggs: ");
			int num = scanner.nextInt();
			if (num == 0)
			{	break;	}
			eggBox.add(num);
		}
		System.out.printf("\nThe total number of eggs: %d",eggBox.size());
		while(true) {
			System.out.print("\nPlease input the number to search eggs index: ");
			int num = scanner.nextInt();
			if (num == 0)
			{	break;	}
			System.out.printf("\nThe index of eggs: %d",eggBox.get(num));
		}
	}

}
