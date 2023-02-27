package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baekjoon3052 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			set.add(scan.nextInt()%42);
		}
		
		System.out.println(set.size());
        
		scan.close();
	}

}
