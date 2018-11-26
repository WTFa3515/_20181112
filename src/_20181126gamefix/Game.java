package _20181126gamefix;
import static java.lang.System.out;
/*
//		if no Action.java then can use this
enum Action{
	STOP, RIGHT, LEFT, UP, DOWN
}
*/

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play(Action.RIGHT);
		play(Action.UP);
		}
	public static void play(Action action) {
		switch(action) {
			case STOP:
				out.println("stop move");
				break;
			case RIGHT:
				out.println("move right");
				break;
			case LEFT:
				out.println("move left");
				break;
			case UP:
				out.println("move up");
				break;
			case DOWN:
				out.println("move down");
				break;
		}
	}

}
