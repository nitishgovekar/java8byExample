package com.streams.anymatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample1 {
	
	public static void main(String[] args) {
		//Returns a fixed-size list backed by the specified array
		List<Integer> lists = Arrays.asList(3, 4, 6, 12, 20);
		// Checks if any element of stream is divisible by 3  
		boolean result = lists.stream().anyMatch(n -> n%3 == 0);
		System.out.println(result);
	}

}
