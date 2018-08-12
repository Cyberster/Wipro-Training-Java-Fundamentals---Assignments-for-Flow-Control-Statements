package com.w3epic.wiprotraining;

public class Assignment13 {

	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
			if (isPrime(i)) System.out.println(i);
		}

	}
	
	public static boolean isPrime(int no) {
		if (no < 0) no *= -1;
		
		Boolean isPrime = true;
		
		for (int i = 2; i < no/2+1; i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (no == 0 || no == 1) isPrime = false;
		
		return isPrime;
	}

}
