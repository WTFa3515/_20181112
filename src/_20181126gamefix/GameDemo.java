package _20181126gamefix;
import static java.lang.System.out;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(Action.DOWN.ordinal());
		out.println(Action.RIGHT.ordinal());

		GameDemo.play(Action.DOWN.ordinal());
		GameDemo.play(Action.RIGHT.ordinal());
	}

	public static void play(int action) {
		switch(action) {
			case 0:
				out.println("stop move");
				break;
			case 1:
				out.println("move right");
				break;
			case 2:
				out.println("move left");
				break;
			case 3:
				out.println("move up");
				break;
			case 4:
				out.println("move down");
				break;
		}
	}
}
