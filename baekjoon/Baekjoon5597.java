package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon5597 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<>();
		int n;
		
		for(int i=0; i<30; i++) {
			arr.add(i+1);
		}
		
		for(int j=1; j<=28; j++) {
			n = scan.nextInt();
			arr.remove(Integer.valueOf(n));
		}
	
		scan.close();
		
		System.out.println(Collections.min(arr));
		System.out.println(Collections.max(arr));
		
	}
}
