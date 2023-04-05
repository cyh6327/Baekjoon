package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon18409 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String s = scan.next();
		int count = 0;
		
		List<Character> sList = new ArrayList<>();	// 입력된 문자열을 char형으로 쪼개서 담을 리스트
		List<Character> vList = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	
		for(int i=0; i<n; i++) {
			sList.add(s.charAt(i));
		}
		
		for(char c : vList) {
			count += Collections.frequency(sList, c);
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
