package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon2754 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		Double score = 0.0;
		String result = "";
		
		for(int i=0; i<3; i++) {
			if(i==0) {
				score = 4.3;
			} else if(i==1) {
				score = 4.0;
			} else if(i==2) {
				score = 3.7;
			}
			for(int j=65; j<=68; j++) {
				result = String.format("%.1f", score);
				if(i==0) {
					map.put((char)j+"+", result);
				} else if(i==1) {
					map.put((char)j+"0", result);
				} else if(i==2) {
					map.put((char)j+"-", result);
				}
				score -= 1.0;
			}
		}
		map.put("F", "0.0");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(map.get(str));
		
		scan.close();
	}

}
