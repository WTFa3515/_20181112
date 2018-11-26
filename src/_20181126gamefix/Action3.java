package _20181126gamefix;

import static java.lang.System.out;

public enum Action3 implements Command {
	STOP, RIGHT, LEFT, UP, DOWN;
	public void execute() {
		switch(this) {
			case STOP:
				out.println("stop direction move");
				break;
			case RIGHT:
				out.println("move direction right");
				break;
			case LEFT:
				out.println("move direction left");
				break;
			case UP:
				out.println("move direction up");
				break;
			case DOWN:
				out.println("move direction down");
				break;
		}
	}
	
	/*
	////master use////
	STOP{
		public void execute(){
			out.println("STOP MOVE")
		}
	},
	RIGHT{
		public void execute(){
			out.println("MOVE RIGHT")
		}
	},
	... ...
	DOWN{
		public void execute(){
			out.println("MOVE DOWN")
		}
	};
	*/
}
