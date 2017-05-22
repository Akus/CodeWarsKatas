package com.akosbodor.shortest_word;

import java.util.ArrayList;

public class ShortestWord {

	public static int FindShort(String inputString) {

		// pseudocode:
		// split incoming string by space
		// loop through the splitted strings and store the shortest one in an ArrayList

		ArrayList<String> shortestArr = new ArrayList<String>();
		
		for (String splitted : inputString.split(" ")) {
						
			System.out.println("current word: " + splitted);
			System.out.println("length of current word is: " + splitted.length());
			System.out.println("The shortestArr BEFORE check: " + shortestArr.toString());
			
			if (shortestArr.isEmpty()) {
				shortestArr.add(splitted);
			}
			
			if (splitted.length() < shortestArr.get(0).length()) {
				
				shortestArr.clear();
				shortestArr.add(splitted);

			}
			else if (splitted.length() == shortestArr.get(0).length() && splitted != shortestArr.get(0)) {
				
				shortestArr.add(splitted);
			}
			
			System.out.println("The shortestArr AFTER check: " + shortestArr.toString() + "\n");

			
		}

		System.out.println(shortestArr.toString());
		return shortestArr.get(0).length();
	}

	public static void main(String[] args) {

		String test = "bitcoin take over the world maybe who knows perhaps";

	System.out.println("The length of the shortest word is: " +	FindShort(test));

	
	}
}
