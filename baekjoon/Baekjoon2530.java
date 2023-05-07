package baekjoon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Baekjoon2530 {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = Integer.parseInt(scan.next()); 
		
		Duration du = Duration.ofHours(a).plusMinutes(b).plusSeconds(c+d);
		
		long hour = du.toHoursPart();
		
		if(hour >= 24)
			hour =- 24;
		
		String answer = hour + " " + du.toMinutesPart() + " " + du.toSecondsPart();
		System.out.println(answer);
	    //System.out.println(seconds);
		
		scan.close();
	}

}
