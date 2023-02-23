package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			arr.add(scan.nextInt());
		}
		
		scan.close();
		
		System.out.print(Collections.min(arr) + " ");
		System.out.print(Collections.max(arr));
		
	}
	
}
