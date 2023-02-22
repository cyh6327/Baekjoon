package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon10871 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			a.add(scan.nextInt());
			if(a.get(i) < x)
				System.out.print(a.get(i) + " ");
		}
		
		scan.close();
		
	}
	
}
