package _20181207;
import java.util.*;
import static java.util.Comparator.*;

public class Sort6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List words = Arrays.asList("B","X", "A", "M", null, "F", "W", "O", null);
		words.sort(nullsFirst(reverseOrder()));
		//words.sort(nullsFirst(natualOrder().reversed()));
		System.out.println(words);
	}

}
