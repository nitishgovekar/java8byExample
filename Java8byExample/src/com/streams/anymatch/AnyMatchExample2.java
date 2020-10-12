package com.streams.anymatch;

import java.util.stream.Stream;

public class AnyMatchExample2 {
	
	public static void main (String args[]) {
		
		// Stream.of ==>returns a sequential ordered stream whose elements are the specified values.
		Stream<String> stream =Stream.of("Nitish","Govekar","Jassos","somabhau");
		
		//Check if the first character is in upperCase or not 
		boolean result = stream.anyMatch(str ->Character.isUpperCase(str.charAt(0)));
		
		System.out.println(result);
	}

}