package com.va.Inclass2.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClassTest {

	@Test
	public void testPass()
	{
		assertTrue(ArrayClass.isPass(35));
		//changed from 80 to 35
		assertFalse(ArrayClass.isPass(45));
	}

	@Test
	public void testGrade()
	{
		assertEquals('A',ArrayClass.grade(95));
		assertEquals('B',ArrayClass.grade(89));
		assertEquals('C',ArrayClass.grade(70));
		assertEquals('D',ArrayClass.grade(62));
		
		assertEquals('F',ArrayClass.grade(80));
		//Changing from 54 to 80
	}
	
}
