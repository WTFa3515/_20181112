package _20181207;
import java.util.*;
import static java.util.Comparator.*;

public class Person {
	private String firstName;
	private String lastName;
	private Integer zipCode;
	
	public Person(String firstName, String lastName, Integer zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return String.format("Person(%s, %s, %d)",firstName, lastName, zipCode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List persons = Arrays.asList(
				new Person("Justin", "Lin", 804),
				new Person("Monica", "Huang", 804),
				new Person("Irene", "Lin", 804)
				);
		persons.sort(Comparator.<Person, String>comparing(p -> p.lastName).thenComparing(p-> p.firstName).thenComparing(p -> p.zipCode));
		System.out.println(persons);
	}

}
