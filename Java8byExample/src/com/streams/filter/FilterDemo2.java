package com.streams.filter;

import java.util.stream.Stream;

public class FilterDemo2 {

	public static void main (String args[]) {
		Stream<String> streams = Stream.of("Virat","Rohit","Dhoni");
		//Will return the names of people whose last letter is T
		streams.filter(s -> s.endsWith("t")).forEach(System.out::println);
	}
	
}
