package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R = 0;
		String S = "";
		
		for (int i=0; i<T; i++) {
			R = sc.nextInt();
			S = sc.next();
			char[] c = new char[S.length()];
			
			for (int j=0; j<S.length(); j++) {
				c[j] = S.charAt(j);
			}
			for (int j=0; j<c.length; j++) {
				for (int k=1; k<=R; k++) {
					System.out.print(c[j]);
				}
			}
			System.out.println();
		}
	}
}
