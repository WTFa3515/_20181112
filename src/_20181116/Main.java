package _20181116;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ResourceSome res = new ResourceSome();
			ResourceOther other = new ResourceOther()){
			res.doSome();
			other.doOther();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

class ResourceSome implements AutoCloseable{
	void doSome() {
		System.out.println("do something");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt());
		//can input not number to try the exception and close()
	}
	@Override
	public void close() throws Exception{
		System.out.println("resource \"Some\" had closed");
	}
}

class ResourceOther implements AutoCloseable{
	void doOther() {
		System.out.println("do something");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt());
		//can input not number to try the exception and close()
	}
	@Override
	public void close() throws Exception{
		System.out.println("resource \"Other\"had closed");
	}
}