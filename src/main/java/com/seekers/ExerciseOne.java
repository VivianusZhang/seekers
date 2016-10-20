package com.seekers;
import java.util.HashMap;

public class ExerciseOne {

	/**
	 * count frequency of each number
	 * and generate a new array
	 * @param a
	 * @return sorted array
	 */
		
	public int[] sort(int[] a) {
		
		HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
		
		for (int i = 1; i < 10; i ++) {
			counter.put(i, 0);
		}		
		
		for (int i = 0; i < a.length; i++) {
			int count = counter.get(a[i]);
			counter.put(a[i], ++count);
		}
		
		int[] ret = new int[a.length];
		int position = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < counter.get(i); j++) {
				ret[position] = i;
				position++;
			}
		}
		
		return ret;
	}
	
}
