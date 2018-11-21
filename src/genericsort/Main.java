package genericsort;
import java.util.*;

class ReversedStringOrder implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -s1.compareTo(s2);
	}
}

public class Main{
	public static void main(String[] args) {
		String[] words = {"B", "X", "A", "M", "F", "W", "O"};
		Arrays.sort(words, new ReversedStringOrder());
		for(String word: words) {
			System.out.println(word);
		}
	}
}
	

	

