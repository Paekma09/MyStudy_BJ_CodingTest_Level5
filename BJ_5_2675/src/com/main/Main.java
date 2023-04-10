package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		char[] a = new char[26];
		
		for (int i=0; i<a.length;i++) {
			a[i] = (char)(97 + i);
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(S.indexOf(a[i])+" ");
		}
	}
}
