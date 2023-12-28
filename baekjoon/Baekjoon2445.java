package baekjoon;

import java.util.Scanner;

public class Baekjoon2445 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=n*2-2; k>i*2; k--) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=n-1; i++) {
            for(int j=n-1; j>=i; j--) {
                System.out.print("*");
            }
            for(int k=0; k<i*2; k++) {
                System.out.print(" ");
            }
            for(int j=n-1; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
