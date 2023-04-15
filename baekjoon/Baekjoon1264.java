package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1264 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		int count = 0;
		List<Character> arr = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
		
		while(true) {
			count = 0;
			str = scan.nextLine().toUpperCase();
			if(str.equals("#"))
				break;
			for(int i=0; i<str.length(); i++) {
				if(arr.contains(str.charAt(i)))
					count += 1;
			}
			System.out.println(count);
		}
		
		scan.close();
	}

}
