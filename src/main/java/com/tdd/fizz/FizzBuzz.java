package com.tdd.fizz;

/**
 * Fizz Buzz Balachandran
 *
 */

public class FizzBuzz {
	private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    
    public static String getResult(int input) {
        String result = "";
        if (input % 3 == 0) {
            result = "Fizz";
        }
        if (input % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? "" + input : result;
    }

    public static void buildOutput() {
        for (int index = MIN_VALUE; index <= MAX_VALUE; index++) {
        	System.out.println(getResult(index));
    }
  }


    public static final void main(String[] args) {
        buildOutput();
    }
    
}
