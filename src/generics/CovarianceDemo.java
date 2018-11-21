package generics;
import java.util.*;

public class CovarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Apple> apple1 = new Node<>(new Apple(),null);
		Node<Apple> apple2 = new Node<>(new Apple(), apple1);
		Node<Apple> apple3 = new Node<>(new Apple(), apple2);
		
		Node<Banana> banana1 = new Node<>(new Banana(), null);
		Node<Banana> banana2 = new Node<>(new Banana(), banana1);
		printlnForEach(apple3);
		printlnForEach(banana2);
		
		Comparator<Fruit>byPrice = new Comparator<Fruit>() {
			@Override
			public int compare(Fruit fruit1, Fruit fruit2) {
				return fruit1.price - fruit2.price;
			}
		};
		
		Basket<Apple> apples = new Basket<>(
				new Apple(25, 150), new Apple(20, 100));
		apples.sort(byPrice);
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple apple1, Apple apple2) {
				return apple1.price - apple2.price;
			}
		});
		printlnForEach(apples);
		
		Basket<Banana> banana = new Basket<>(
				new Banana(30, 200), new Banana(50, 300));
		apples.sort(byPrice);
		banana.sort(new Comparator<Banana>() {
			@Override
			public int compare(Banana banana1, Banana banana2) {
				return banana1.price - banana2.price;
			}
		});
		printlnForEach(banana);
	}

	private static void printlnForEach(Basket<? extends Fruit> basket) {
		// TODO Auto-generated method stub
		for(Fruit fruit : basket.things) {
			System.out.printf("%s(%d, %d) ", fruit.getClass().getName(),
					fruit.price, fruit.weight);
		}
		System.out.println();
	}

	private static void printlnForEach(Node<? extends Fruit> n) {
		// TODO Auto-generated method stub
		Node<? extends Fruit> node = n;
		do {
			System.out.println(node.value);
			node = node.next;
		}while(node != null);
	}

}
