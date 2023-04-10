package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			String S = sc.next();
			char first = S.charAt(0);
			char last = S.charAt(S.length()-1);
			System.out.print(first);
			System.out.print(last);
			System.out.println();
		}
	}
}
