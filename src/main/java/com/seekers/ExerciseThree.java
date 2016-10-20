package com.seekers;

public class ExerciseThree {

	/**
	 * liner solution:
	 * prove：
	 * suppose we have X "(" and Y ")" in total
	 * and in position p ; we have :
	 * X1(X on left side) + Y1(Y on left side) = X2(X on right side) + Y2(Y on right side)
	 * also, at position p; we need to have X1 = Y2;
	 * which means: X1 + Y1 = Y2 + Y1 = Y
	 * so the position p is in the total number of Y
	 * @param s
	 * @return position p where "(" before equal to ")" after
	 */
	
	
	public int findPosition1(String s) {
		int counter = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(String.valueOf(s.charAt(i)).equals(")")) {
				counter++;
			} 			
		}
		return counter;
	}
	
	/**
	 * non liner solution
	 * @param s
	 * @return position p where "(" before equal to ")" after
	 */
	public int findPosition2(String s) {
		
		int afterBracket = 0;
		int frontBracket = 0;
		for (int position = 0; position <= s.length(); position++ ) {
			for (int i = 0; i < position; i++) {
				if(String.valueOf(s.charAt(i)).equals("(")) {
					frontBracket++;
				} 
				
			}
			
			for (int j = (s.length() - 1); j >= position; j--) {
				if(String.valueOf(s.charAt(j)).equals(")")) {
					afterBracket++;
				} 
			}
			
			if (frontBracket == afterBracket) {
				return position;
			}else {
				afterBracket = 0;
				frontBracket = 0;				
			}			
		}
				
		return -1;
	}
	
}
