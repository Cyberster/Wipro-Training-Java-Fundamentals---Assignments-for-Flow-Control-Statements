package com.w3epic.wiprotraining;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Add\n2. Sub");
		int choice = sc.nextInt();
		
		int operand1;
		int operand2;
		int result;
		
		if (choice == 1) {
			System.out.println("Enter first operand: ");
			operand1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			operand2 = sc.nextInt();
			result = operand1 + operand2;
		} else {
			System.out.println("Enter first operand: ");
			operand1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			operand2 = sc.nextInt();
			result = operand1 - operand2;
		}
		
		System.out.println("Result: " + result);
		
		System.out.println("Do you want to continue? Y or N");
		
		sc.nextLine();		
		choice = sc.nextLine().charAt(0);
		
		if (choice == 'Y' || choice == 'y') main(args);
		
		sc.close();
	}

}
