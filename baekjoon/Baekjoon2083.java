package baekjoon;

import java.util.Scanner;

public class Baekjoon2083 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int age = 0;
		int weight = 0;
		String cate = "";
		
		while(true) {
			name = scan.next();
			age = scan.nextInt();
			weight = scan.nextInt();
			
			if(name.equals("#"))
				break;
			
			if(age > 17 || weight >= 80)
				cate = "Senior";
			else 
				cate = "Junior";
			
			System.out.println(name + " " + cate);
		}
		
		scan.close();
	}

}
