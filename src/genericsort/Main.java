package genericsort;
import java.util.*;

public class Main{
	public static void main(String[] args) {
			String[] words = {"B", "X", "A", "M", "F", "W", "O"};
			Arrays.sort(words, new ReversedStringOrder() {
				@Override
				public int compare(String s1, String s2) {
					// TODO Auto-generated method stub
					return -s1.compareTo(s2);
				}
			});
			for(String word: words) {
				System.out.println(word);
			}
		}
}
	

	

