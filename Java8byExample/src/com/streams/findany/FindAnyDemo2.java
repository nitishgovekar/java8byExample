package com.streams.findany;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyDemo2 {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16).parallel(); 
		stream = stream.filter(x->x%7==0);
		OptionalInt answer = stream.findAny();
		if(answer.isPresent()) {
			System.out.println(answer.getAsInt());
		}
		else {
			System.out.println("No records found");
		}
	}
}

/*
 * OPTIONALINT : A container object which may or may not contain a int value. If
 * a value is present, isPresent() will return true and getAsInt() will return
 * the value.
 */
