package LambdA;
import static java.lang.System.out;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DemoStringOrder {

	public static void main(String[] args) {
		String[] names = {"Justin", "caterpillar", "Bush"};
		System.out.println("####byLength####");
		//Arrays.sort(names, (name1, name2) -> StringOrder.byLength(name1, name2));
		Arrays.sort(names, StringOrder::byLength);
		for (String name: names) {
			System.out.println(name);
		}
		System.out.println("####Lexicography####");
		//Arrays.sort(names, (name1, name2) -> StringOrder.byLexicography(name1, name2));
		//Arrays.sort(names, StringOrder::byLexicography);
		Arrays.sort(names, String::compareTo);
		for (String name: names) {
			System.out.println(name);
		}
		System.out.println("####LexicographyIgnoreCase####");
		//Arrays.sort(names, (name1, name2) -> StringOrder.byLexicographyIgnoreCase(name1, name2));
		Arrays.sort(names, StringOrder::byLexicographyIgnoreCase);
		// 				   == String :: compareToIgnoreCase
		for (String name: names) {
			System.out.println(name);
		}
		List<String> namess = Arrays.asList("Justin", "caterpillar", "Bush");
		out.println("####forEach print way####");
		namess.forEach(namee -> out.println(namee));
		new HashSet(namess).forEach(out::println);
		new ArrayDeque(namess).forEach(out::println);
	}
}
