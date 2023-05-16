package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10808 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
			
		List<Character> list = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		for(int j='a'; j<='z'; j++) {
			System.out.print(Collections.frequency(list, (char)j) + " ");
		}
		
		scan.close();
	}
}
