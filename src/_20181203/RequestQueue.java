package _20181203;
import java.util.*;

interface Request{
	void execute();
}
public class RequestQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Request> requests = new LinkedList<>();
		offerRequestTo(requests);
		process(requests);
	}
	static void offerRequestTo(Queue<Request> requests) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 6; i++) {
			requests.offer(() -> System.out.printf("Data detail %f \n",Math.random()));
		}
	}
	private static void process(Queue<Request> requests) {
		// TODO Auto-generated method stub
		while(requests.peek() != null) {
			Request request = requests.poll();
			request.execute();
		}
	}
}
