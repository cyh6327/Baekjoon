package baekjoon;

import java.util.Scanner;

public class Baekjoon11655 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if(str.charAt(i) >= 'N' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'n' && str.charAt(i) <= 'z') {
					answer += (char)(str.charAt(i)-13);
				} else {
					answer += (char)(str.charAt(i)+13);
				}
			} else {
				answer += str.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}
