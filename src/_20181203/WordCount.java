package _20181203;
import java.util.*;

public class WordCount {
	public static void main (String[] args) {
		String line = input("Please input English : ");
		Set<String> words = tokens(line);
		System.out.printf("%d  words Non repeat are %s \n", words.size(),words);
	}

	static String input (String prompt) {
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
	private static Set<String> tokens(String line) {
		// TODO Auto-generated method stub
		String[] tokens = line.split("");
		Set<String> words = new HashSet<>();
		for (String token : tokens) {
			words.add(token);
		}
		return words;
	}
}
