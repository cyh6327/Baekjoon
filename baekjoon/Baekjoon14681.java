package baekjoon;

import java.util.Scanner;

public class Baekjoon14681 {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			if(num>0 && num2>0)
				System.out.println("1");
			else if(num<0 && num2>0)
				System.out.println("2");
			else if(num<0 && num2<0)
				System.out.println("3");
			else
				System.out.println("4");
		}
}
