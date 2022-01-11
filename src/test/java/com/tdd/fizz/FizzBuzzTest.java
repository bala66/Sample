package com.tdd.fizz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testGetResult() {
		 assertEquals("1", FizzBuzz.getResult(1));
		    assertEquals("2", FizzBuzz.getResult(2));
		    assertEquals("Fizz", FizzBuzz.getResult(3));
		    assertEquals("Fizz", FizzBuzz.getResult(6));
		    assertEquals("Fizz", FizzBuzz.getResult(9));
			assertEquals("FizzBuzz", FizzBuzz.getResult(15));
	}
}
