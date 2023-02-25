package baekjoon;

import java.util.Scanner;

public class Baekjoon10813 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i,j,i2,j2;
		int[] arr = new int[n];
		
		for(int a=0; a<n; a++) {
			arr[a] = a+1;
		}
		
		for(int b=0; b<m; b++) {
			i = scan.nextInt();
			j = scan.nextInt();
			i2 = arr[i-1];
			j2 = arr[j-1];
			arr[i-1] = j2;
			arr[j-1] = i2;
		} 
		
		scan.close();
		
		for(int c : arr) {
			System.out.print(c + " ");
		}
		
	}
}
