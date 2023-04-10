package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dial = sc.next();
		
		char[] d = new char[dial.length()];
		int[] number = new int[dial.length()];
		int count = 0;
		
		for (int i=0; i<dial.length();i++) {
			d[i] = dial.charAt(i);
			if (d[i] == 'A' || d[i] == 'B' || d[i] == 'C') {
				number[i] = 2;
			} else if (d[i] == 'D' || d[i] == 'E' || d[i] == 'F') {
				number[i] = 3;
			} else if (d[i] == 'G' || d[i] == 'H' || d[i] == 'I') {
				number[i] = 4;
			} else if (d[i] == 'J' || d[i] == 'K' || d[i] == 'L') {
				number[i] = 5;
			} else if (d[i] == 'M' || d[i] == 'N' || d[i] == 'O') {
				number[i] = 6;
			} else if (d[i] == 'P' || d[i] == 'Q' || d[i] == 'R' || d[i] == 'S') {
				number[i] = 7;
			} else if (d[i] == 'T' || d[i] == 'U' || d[i] == 'V') {
				number[i] = 8;
			} else if (d[i] == 'W' || d[i] == 'X' || d[i] == 'Y' || d[i] == 'Z') {
				number[i] = 9;
			} else if (d[i] == '1') {
				number[i] = 1;
			} else if (d[i] == '0') {
				number[i] = 0;
			}
		}
		
		for (int i=0; i<number.length; i++) {
			count += number[i]+1;
		}
	
		System.out.println(count);
	}
}
