package ClassTest;
import static java.lang.System.out;
import java.util.concurrent.TimeUnit;

public class Factory_Mart_Custom {
	static int warehouse = 25;
	final static int maxrestock = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max warehouse is 50 
		while(warehouse <= 50 && warehouse > 0) {
			out.println("===================");
			int randint = (int) (Math.random()*20);
			out.printf("Now warehouse have %d goods\n", warehouse);
			try {
				int customers = randint;
				TimeUnit.SECONDS.sleep(1);
				if(warehouse < 10) {
					warehouse += maxrestock;
				}else{
					warehouse += maxrestock * (1- warehouse/50);
				}
				out.printf("%d customers take out %d goods\n", customers, customers);
				warehouse -= customers;
				out.printf("After shopping  warehouse have %d goods\n", warehouse);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (warehouse > 50) {
			out.println("warehouse is break");	
		}else {
			out.println("Out of Stock, break credit");	
		}
	}
	
	static void result(String outp){
		out.println("Out of Stock, break credit");
	}
	static void result(int outp){
		out.println("warehouse is break");
	}
}
