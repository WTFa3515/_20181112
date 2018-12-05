package _20181205;
import java.util.*;

class Account2 implements Comparable<Account2>{
	private String name;
	private String number;
	private int balance;
	Account2(String name, String number, int balance){
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public String toString() {
		return String.format("Account2(%s, %s, %d)", name, number, balance);
	}
	
	@Override
	public int compareTo(Account2 other) {
		return this.balance - other.balance;
	}
}

public class Sort3 {
	public static void main (String[] args) {
		List<Account2> accounts = Arrays.asList(
				new Account2("Justin","X1234", 1000),
				new Account2("Monica","X5678", 500),
				new Account2("Irene","X2468", 200)
				);
		Collections.sort(accounts);
		System.out.println(accounts);
		//add
		for (Account2 iterable : accounts) {
			System.out.println(iterable);
		}
	}
}
