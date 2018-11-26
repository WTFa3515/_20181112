package _20181126gamefix;

public enum Priority {
	MAX(10), NORM(5), MIN(1);
	private int value;
	private Priority(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Priority.values()[1]);
		for (Priority priority: Priority.values()) {
			System.out.printf("Priority(%s, %d)\n",priority, priority.value());
		}
	}
}
