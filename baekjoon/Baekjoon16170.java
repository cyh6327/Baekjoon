package baekjoon;

import java.time.LocalDate;
import java.time.ZoneId;

public class Baekjoon16170 {
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now(ZoneId.of("UTC"));
		
		System.out.printf(now.getYear() + "\n" + "%02d" + "\n" + "%02d",now.getMonthValue(), now.getDayOfMonth());
	}

}
