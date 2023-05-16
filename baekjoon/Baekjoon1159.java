package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Baekjoon1159 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		String answer = "";
		Map<Character, Integer> map = new HashMap<>();
		TreeSet<Character> set = new TreeSet<>();
		int cnt = 1;
		
		for(int i=0; i<t; i++) {
			String str = scan.next();
			cnt = map.getOrDefault(str.charAt(0), 1);
			if(map.containsKey(str.charAt(0))) {
				cnt++;
			}
			map.put(str.charAt(0), cnt);
			if(map.get(str.charAt(0)) >= 5) {
				set.add(str.charAt(0));
			}
		}
		
		for(char c : set) {
			answer += c;
		}
		
		if(set.isEmpty()) 
			System.out.println("PREDAJA");
		else
			System.out.println(answer);
		
		scan.close();
	}

}
