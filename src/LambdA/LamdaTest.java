package LambdA;

import java.util.*;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Justin", "caterpillar", "Bush"};
		/*
		Arrays.sort(names, new Comparator<String>() {
			public int compare(String name1, String name2) {
				return name1.length() - name2.length();
			}
		});
		����������������������������������������*/
		/*
		Comparator<String> byLength = new Comparator<String>() {
			public int compare(String name1, String name2) {
				return name1.length() - name2.length();
			}
		});
		Arrays.sort(names, byLength);
		����������������������������������������*/
		/*
		Comparator<String> byLength = (String name1, String name2) -> name1.length() - name2.length();
			
		Arrays.sort(names, byLength);
		����������������������������������������*/
		/*
		Comparator<String> byLength = (name1, name2) -> name1.length() - name2.length();
			
		Arrays.sort(names, byLength);
		����������������������������������������*/
		
		Arrays.sort(names, (name1, name2) -> name1.length() - name2.length() );
		for(String word: names) {
			System.out.println(word);
		}
	}

}
