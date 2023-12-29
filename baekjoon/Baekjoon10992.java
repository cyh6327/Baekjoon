package baekjoon;

import java.util.Scanner;

public class Baekjoon10992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) System.out.print(" ");
            System.out.print("*");
            for(int j=1; j<i*2; j++) System.out.print(" ");
            if(i!=0) System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<2*n-1; i++) System.out.print("*");
    }
}
