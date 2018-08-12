package com.w3epic.wiprotraining;

public class Assignment7 {

	public static void main(String[] args) {
		char ch = 'a';
		
		if (Character.isLowerCase(ch)) 
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));

	}

}
