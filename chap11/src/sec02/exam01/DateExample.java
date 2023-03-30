package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		

	}

}
