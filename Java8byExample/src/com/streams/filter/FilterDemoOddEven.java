package com.streams.filter;

import java.util.Arrays;
import java.util.List;

public class FilterDemoOddEven {
	
	public static void main (String args[]) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int  sum=0;
		System.out.println("oddNumbers");
		list.stream().filter(x -> x%2 !=0).forEach(System.out::println);
		System.out.println("EvenNumbers");
		list.stream().filter(x ->x%2 ==0).forEach(System.out::println);

		sum	=	sumofEvenNumbers(list);
		System.out.println("Sum of Even Numbers is "+sum);
		sum=	sumofOddNumbers(list);
		System.out.println("Sum of Odd Numbers is "+sum);
	}

	private static int sumofEvenNumbers(List<Integer> list) {
		return list.stream().filter(x ->x%2 ==0).mapToInt(x ->x).sum();
	}

	private static int sumofOddNumbers(List<Integer> list) {
		return list.stream().filter(x ->x%2 !=0).mapToInt(x ->x).sum();
	}
}
