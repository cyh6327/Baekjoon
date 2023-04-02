package baekjoon;

import java.time.LocalDate;
import java.time.ZoneId;

public class Baekjoon10699 {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(ZoneId.of("UTC"));
		System.out.println(today);
	}

}
