package com.w3epic.wiprotraining;

public class Assignment5 {

	public static void main(String[] args) {
		char ch = '*';
		
		//for (int i = 0; i < 128; i++) System.out.printf("%d: %c \n", i, i);
		
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("Alphabet");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}

	}

}
