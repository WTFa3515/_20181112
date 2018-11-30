package LambdA;
import static java.lang.System.out;
class Hello{
	Runnable r1 = new Runnable() {
		public void run() {
			out.println(this);
		}
	};
	Runnable r2 = new Runnable() {
		public void run() {
			out.println(toString());
		}
	};
	public String toString() {
		return"Hello world!";
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello().r1.run();
		new Hello().r2.run();
	}
}
