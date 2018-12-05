package ClassTest;
import static java.lang.System.out;
import java.util.concurrent.TimeUnit;

public class Factory_Mart_Custom {
	static int warehouse = 50;
	final static int maxrestock = 10;
	//¯Ê³f Out of Stock
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(warehouse <= 50 && warehouse > 0) {
			int randint = (int) (Math.random()*20);
			out.printf("Now warehouse have %d goods\n", warehouse);
			try {
				int customers = randint;
				TimeUnit.SECONDS.sleep(1);
				if(warehouse < 10) {
					warehouse += maxrestock;
				}
				out.printf("%d customers take out %d goods\n", customers, customers);
				out.printf("After shopping  warehouse have %d goods\n", warehouse);
				warehouse -= customers;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.print("sell out, break credit");
	}

}
