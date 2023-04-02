package com.stream.examples;

import java.util.stream.IntStream;

public class FindSumOfAllBetween1To5 {

	public static void main(String[] args) {

		// Find sum of all between 1 to 5
		int sum = IntStream.of(1, 2, 3, 4, 5).sum();
		System.out.println("Sum is: " + sum);
		
		// Find sum of all between 1 to 5
		//6 is not count in range
		int sum2 = IntStream.range(1,6).sum();
		System.out.println("sum2 is :"+sum2);
	}

}
