package com.seekers;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class ExercisesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExerciseOne() {
		ExerciseOne e1 = new ExerciseOne();
		int[] ae11 = new int[100];
		for(int i = 0; i < 100; i++) {
			ae11[i] = new Random().nextInt(9)+1;
		}
		e1.sort(ae11);
	}

	@Test
	public void testExerciseTwo() {
		ExerciseTwo e2 = new ExerciseTwo();
		int[] ae21 = {1, 2, 3, 4};
		int[] ae22 = {0, 1, 5, 6};
		int[] ae23 = {1, 5, 8, 9};
		int[] ae24 = {6, 7, 8, 9};

		assertEquals(e2.genMaxTime(ae21),"23.41");
		assertEquals(e2.genMaxTime(ae22),"16.50");
		assertEquals(e2.genMaxTime(ae23),"19.58");
		assertEquals(e2.genMaxTime(ae24),"no solution");		
	}

	@Test
	public void testExerciseThree() {
		ExerciseThree e3 = new ExerciseThree();
		String s = "(())";
		String s1 = "((((((";
		String s2 = "())))";
		String s3 = ")))(";
		String s4 = ")))";

		assertEquals(e3.findPosition1(s),2);
		assertEquals(e3.findPosition1(s1),0);
		assertEquals(e3.findPosition1(s2),4);
		assertEquals(e3.findPosition1(s3),3);
		assertEquals(e3.findPosition1(s4),3);
		
		assertEquals(e3.findPosition1(s),e3.findPosition2(s));
		assertEquals(e3.findPosition1(s1),e3.findPosition2(s1));
		assertEquals(e3.findPosition1(s2),e3.findPosition2(s2));
		assertEquals(e3.findPosition1(s3),e3.findPosition2(s3));
		assertEquals(e3.findPosition1(s4),e3.findPosition2(s4));
		
	
	}
	
}
