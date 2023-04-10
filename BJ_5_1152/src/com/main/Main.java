package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.trim();
		
		if (s.equals("")) {
			System.out.print(0);
		}else {
			String[] S = s.split(" ");	
			System.out.print(S.length);
		}
	}
}
