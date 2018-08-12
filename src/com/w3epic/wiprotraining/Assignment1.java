package com.w3epic.wiprotraining;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		if (x < 0) System.out.println("Negative");
		else if (x == 0) System.out.println("Zero");
		else System.out.println("Positive");
		
		main(args);
		sc.close();
	}

}
