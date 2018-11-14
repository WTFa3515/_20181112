package readfile;
import readfile.FileUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtil fileutil = new FileUtil();
		String x = fileutil.readFile("C:\\workspace\\_20181112\\src\\readfile\\read.txt");
		System.out.printf(x);
	}

}
