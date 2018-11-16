package _20181116;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Resource res = new Resource()){
			res.doSome();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

class Resource implements AutoCloseable{
	void doSome() {
		System.out.println("do something");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt());
		//can input not number to try the exception and close()
	}
	@Override
	public void close() throws Exception{
		System.out.println("resource had closed");
	}
}