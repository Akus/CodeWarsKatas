/* 7kyu
 * You are going to be given a word. 
 * Your job is to return the middle character of the word. 
 * If the word's length is odd, return the middle character. 
 * If the word's length is even, return the middle 2 characters.
 */


package com.akosbodor.get_the_middle_char;

public class GetTheMiddleChar {

	public static String getMiddle(String word) {

		int middle = word.length()/2;
		if (word.length() % 2 == 0) {
							
			// for StringBuilder solution:
			char char1 = word.charAt(middle-1);
			char char2 = word.charAt(middle);
						
			//String s = new StringBuilder().append(char1).append(char2).toString();
			// other solution: 
			String s = word.substring(middle-1, middle+1);
			
			return s;
		} else {
			
			int index1 = word.length()/2;
			char char1 = word.charAt(index1);
			
			
			//String s = new StringBuilder().append(char1).toString();
			// other solution: 
			String s = word.substring(middle, middle+1);
			
			return s;
		}

	}

	public static void main(String[] args) {

		System.out.println("Test 1 result should be: es \nYour result is: " + getMiddle("test"));
		System.out.println("Test 2 result should be: dd \nYour result is: " + getMiddle("middle"));
		System.out.println("Test 3 result should be: t \nYour result is: " + getMiddle("testing"));
		System.out.println("Test 4 result should be: A \nYour result is: " + getMiddle("A"));

	}

}
