package _20181112;
import java.util.Scanner;

public class Average4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int  count = 0;
		int number;
		while(true) {
			number = nextInt();
			if(number == 0) {
				break;
			}
			sum += number;
			count ++;
		}
		System.out.printf("Average %.2f\n", sum);
	}
	static Scanner scanner = new Scanner(System.in);
	
	static int nextInt() {
		String input = scanner.next();
		while(!input.matches("\\d*")) {
			System.out.println("Please input digital");
			input = scanner.next();
		}
		return Integer.parseInt(input);
	}
}
