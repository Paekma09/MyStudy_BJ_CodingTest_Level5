package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String a = Integer.toString(A);
		String b = String.valueOf(B);
		
		char[] Aa = a.toCharArray();
		char[] aA = new char[Aa.length];
		for(int i=0; i<Aa.length; i++) {
			aA[Aa.length-1-i] = Aa[i];
		}
		String reversedA = new String(aA);
		int valueA = Integer.parseInt(reversedA);
		
		char[] Bb = b.toCharArray();
		char[] bB = new char[Bb.length];
		for(int i=0; i<Bb.length; i++) {
			bB[Bb.length-1-i] = Bb[i];
		}
		String reversedB = new String(bB);
		int valueB = Integer.parseInt(reversedB);
		
		if (valueA > valueB) {
			System.out.println(valueA);
		} else if (valueA < valueB) {
			System.out.println(valueB);
		}
	}
}
