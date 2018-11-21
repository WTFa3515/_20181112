package genericsort;
import java.util.*;

public class Play_Util {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {5,3,4,1,2};
		String[] words = {"B", "X", "A", "M", "F", "W", "O"};

		for (String word : words) {
			System.out.print(word);
		}
		Util.sort(words);
		System.out.println("\nafter sort");
		for (String word : words) {
			System.out.print(word);
		}
		System.out.println("\nsort number");
		Util.sort(list);
		for (int num : list) {
			System.out.print(num);
		}
	}
}
