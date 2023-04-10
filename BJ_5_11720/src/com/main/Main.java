package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s = sc.next();
		
		int[] n = new int[N];
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			n[i] = Character.getNumericValue(s.charAt(i));
			sum += n[i];
		}
		System.out.print(sum);
	}
}
