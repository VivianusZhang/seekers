package com.seekers;
import java.util.Arrays;
import java.util.Random;

public class TestResult {

	public static void main(String[] args) {
		// not usful
		//ExerciseOne test case
		ExerciseOne e1 = new ExerciseOne();
		int[] ae11 = new int[100];
		for(int i = 0; i < 100; i++) {
			ae11[i] = new Random().nextInt(9)+1;
		}
		
		System.out.println("ExerciseOne:" + Arrays.toString(e1.sort(ae11)));
		System.out.println();
		
		//ExerciseTwo test cases
		ExerciseTwo e2 = new ExerciseTwo();
		int[] ae21 = {1, 2, 3, 4};
		int[] ae22 = {0, 1, 5, 6};
		int[] ae23 = {1, 5, 8, 9};
		int[] ae24 = {0, 0, 0, 0};
		
		System.out.println("ExerciseTwo: " + e2.genMaxTime(ae21));
		System.out.println("ExerciseTwo: " + e2.genMaxTime(ae22));
		System.out.println("ExerciseTwo: " + e2.genMaxTime(ae23));
		System.out.println("ExerciseTwo: " + e2.genMaxTime(ae24));

		System.out.println();

		//ExerciseThree test cases
		ExerciseThree e3 = new ExerciseThree();
		String s = "(())";
		String s1 = "((((((";
		String s2 = "())))";
		String s3 = ")))(";
		String s4 = ")))";
		
		System.out.println("ExerciseThree method 1: " + e3.findPosition1(s));
		System.out.println("ExerciseThree method 1: " + e3.findPosition1(s1));
		System.out.println("ExerciseThree method 1: " + e3.findPosition1(s2));
		System.out.println("ExerciseThree method 1: " + e3.findPosition1(s3));		
		System.out.println("ExerciseThree method 1: " + e3.findPosition1(s4));
		
		System.out.println("ExerciseThree method 2: " + e3.findPosition2(s));
		System.out.println("ExerciseThree method 2: " + e3.findPosition2(s1));
		System.out.println("ExerciseThree method 2: " + e3.findPosition2(s2));
		System.out.println("ExerciseThree method 2: " + e3.findPosition2(s3));		
		System.out.println("ExerciseThree method 2: " + e3.findPosition2(s4));
		
	}

}
