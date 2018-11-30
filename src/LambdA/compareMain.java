package LambdA;

import static java.lang.System.out;
class hellow{
	Runnable r1 = () -> out.println(this);
	Runnable r2 = () -> out.println(toString());
	//Lambda will point toward which has "return"
	//·|«ü¦Vreturn 
	public String toString() {
		return"Hello world!";
	}
}

public class compareMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new hellow().r1.run();
		new hellow().r2.run();
	}
}