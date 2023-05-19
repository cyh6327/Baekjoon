package baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon1157 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String answer = "";
		String str = scan.next().toUpperCase();
		int cnt = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			cnt = map.getOrDefault(str.charAt(i), 1);
			if(map.containsKey(str.charAt(i))) {
				cnt++;
			}
			map.put(str.charAt(i), cnt);
		}
		
		int max = Collections.max(map.values());
		int cnt2 = 0;
		
		for (Character key : map.keySet()) {
			if(map.get(key).equals(max)) {
				cnt2++;
				if(cnt2 >= 2)
					answer = "?";
				else
					answer = key+"";
			}
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}
