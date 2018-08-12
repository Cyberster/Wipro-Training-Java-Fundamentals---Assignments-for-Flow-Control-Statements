package com.w3epic.wiprotraining;

public class Assignment18 {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		
		if (getPalindromeNumber(number) == 2)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + "is not a palindrome");
	}
	
	public static int getPalindromeNumber (int input1) {
		String numberStr = String.valueOf(input1);
		int digitCount = numberStr.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (numberStr.charAt(i) != numberStr.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		if (isPalindrome == true) return 2;
		else return 1;
	}

}
