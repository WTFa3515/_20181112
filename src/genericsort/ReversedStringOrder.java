package genericsort;
import java.util.*;

public class ReversedStringOrder implements Comparator<String> {


	public static class Main{
		public static void main(String[] args) {
			String[] words = {"B", "X", "A", "M", "F", "W", "O"};
			Arrays.sort(words, new ReversedStringOrder());
			for(String word: words) {
				System.out.println(word);
			}
		}
	}
	
	Arrays.sort(words, new Comparator<String>()){

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return -s1.compareTo(s2);
		}
		
	}
	
}
