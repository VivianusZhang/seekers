package com.seekers;
import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
		
	ExerciseTwo() {
		
	}
	
	/**
	 * swqp elements in position i and j in array
	 * @param array
	 * @param i
	 * @param j
	 */
	private void swap(int[] array, int i, int j) {
	    if (i == j) return;
	    int x = array[i];
	    array[i] = array[j];
	    array[j] = x;
	  }
	
	/**
	 * iterate to get all possible combinations
	 * and store them into a result list
	 */
	
	private void posibleResults(int[] a, int start, int end, List<int[]> results) {
	    if (start == end) {
	        	results.add(a.clone());
	        	//System.out.println(Arrays.toString(a));

	      } else {
	        for (int i = start; i < end; i++) {
	          swap(a, i, start);
	          posibleResults(a, start + 1, end, results);
	          swap(a, start, i);
	        }
	      }	
	}
		
	/**
	 * check valid time in list
	 * store max time
	 * @param a
	 * @return valid max time or "no solution" if no valid time
	 */
	private String checkMaxValid(List<int[]> a) {
		int hour = -1;
		int minute = -1;
		int tempHour = 0;
		int tempMinute = 0;
		
		for (int i = 0; i < a.size(); i++) {
			tempHour = a.get(i)[0] * 10 + a.get(i)[1];
			tempMinute = a.get(i)[2] * 10 + a.get(i)[3];
			
			if (tempHour < 24 && tempMinute < 60) {
				if (tempHour > hour) {
					hour = tempHour;
					minute = tempMinute;
				} else if (tempHour == hour && tempMinute > minute) {
					hour = tempHour;
					minute = tempMinute;					
				}
			} 

		}
		
		if (hour == -1 && minute == -1) {
			return "no solution";
		} else {			
			return String.format("%02d.%02d", hour, minute);
		}
	}
	
	/**
	 * entry function
	 * @param a
	 * @return
	 */
	public String genMaxTime (int[] a) {	
		List<int[]> results = new ArrayList<int[]>();
		posibleResults(a, 0, 4, results);
		return checkMaxValid(results);
	}
	
}
