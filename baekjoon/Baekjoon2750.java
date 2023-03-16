package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2750 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			arr.add(scan.nextInt());
		}
		
		for(int j=0; j<n; j++) {
			System.out.println(Collections.min(arr));
			arr.remove(Collections.min(arr));
		}
		
		scan.close();
	}

}
