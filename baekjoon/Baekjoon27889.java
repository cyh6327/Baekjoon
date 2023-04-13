package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon27889 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<>();
		map.put("NLCS", "North London Collegiate School");
		map.put("BHA", "Branksome Hall Asia");
		map.put("KIS", "Korea International School");
		map.put("SJA", "St. Johnsbury Academy");
		
		String str = scan.next();
		System.out.println(map.get(str));
		
		scan.close();
	}

}
