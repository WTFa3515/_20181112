package _20181126gamefix;

public class Game3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game3.play(Action3.RIGHT);
		Game3.play(Action3.DOWN);
	}
	
	static void play(Action3 action) {
		action.execute();
	}
}
