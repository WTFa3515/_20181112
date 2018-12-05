package _20181205;
import static java.lang.System.out;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names = Arrays.asList("Justin","Monica","Irene");
		/*
		forEach(names);
		forEach(new HashSet(names));
		forEach(new ArrayDeque(names));
		*/
		/*
		names.forEach(name -> out.println(name));
		new HashSet(names).forEach(name -> out.println(name));
		new ArrayDeque(names).forEach(name -> out.println(name));
		*/
		names.forEach(out :: println);
		new HashSet(names).forEach(out :: println);
		new ArrayDeque(names).forEach(out :: println);
	}
/*
	private static void forEach(Iterable iterable) {
		// TODO Auto-generated method stub
		for (Object o : iterable) {
			System.out.println(o);
		}
		System.out.println("======");
	}
	
	public static void forEach(Collection collection) {
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	*/
}
