package readfile;
import java.io.FileNotFoundException;

import readfile.FileUtil;

public class Demo {
										//must catch or still throws(abstract)
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileUtil fileutil = new FileUtil();
		String x = fileutil.readFile("C:\\workspace\\_20181112\\src\\readfile\\read.txt");
		System.out.printf(x);
	}

}
