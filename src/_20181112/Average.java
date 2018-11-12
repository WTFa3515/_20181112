package _20181112;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Average{
	public static void main(String[] args){
		//back1:
			Scanner scanner = new Scanner(System.in);
			double sum = 0;
			int count = 0;
			int number = 0;
			while(true){
				try {
					number = scanner.nextInt();
					if(number == 0) {break;}
				} catch (java.util.InputMismatchException e){
					// TODO Auto-generated catch block
					System.out.printf("Ignore error input %s\n",scanner.next());
				}
				sum += number;
				count++;
			}
			System.out.printf("Average%.2f\n", sum/count);

	}
}