package com.w3epic.wiprotraining;

public class Assignment19 {

	public static void main(String[] args) {
		
		int counter = 0;
		int i = 0;
		
		while (counter != 5) {
			i++;
			
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				counter++;
			}
		}
	}

}
