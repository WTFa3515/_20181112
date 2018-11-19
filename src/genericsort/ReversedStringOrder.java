package genericsort;
import java.util.*;

public class ReversedStringOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

	public static class Main{
		public static void main(String[] args) {
			String[] words = {"B", "X", "A", "M", "F", "W", "O"};
			Arrays.sort(words);
			for(String word: words) {
				System.out.println(word);
			}
		}
	}
	/*
	Array.sort(words, new Comparator<String>()){

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return -s1.compareTo(s2);
		}
		
	}
	*/
}
