package baekjoon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Baekjoon1924 {
	
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		LocalDate date = LocalDate.of(2007, x, y);
		 
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.printf("%.3s", dayOfWeek);
		
		scan.close();
	}

}
