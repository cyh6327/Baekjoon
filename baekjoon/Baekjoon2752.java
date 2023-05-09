package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2752 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] arr = {a, b, c};
		
		Arrays.parallelSort(arr);
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		scan.close();
	}

}
