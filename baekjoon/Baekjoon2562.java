package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2562 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<9; i++) {
			arr.add(scan.nextInt());
		}
			
		System.out.println(Collections.max(arr));
		System.out.println((arr.indexOf(Collections.max(arr)))+1);
		
		scan.close();
	}
}
