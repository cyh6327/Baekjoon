package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2587 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		System.out.println(sum/arr.length);
		System.out.println(arr[arr.length/2]);
		
		scan.close();
	}

}
