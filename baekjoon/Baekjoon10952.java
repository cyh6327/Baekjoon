package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(true) {
				a = scanner.nextInt();
				b = scanner.nextInt();
			    if(a == 0 && b == 0) {
			        break;
			    }
			    arr.add(a+b);
		}
		
		for (int i : arr)
			System.out.println(i);
		
		scanner.close();
	}
}
