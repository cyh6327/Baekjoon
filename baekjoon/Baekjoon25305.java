package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon25305 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(scan.next());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[k-1]);
		
		scan.close();
	}

}
