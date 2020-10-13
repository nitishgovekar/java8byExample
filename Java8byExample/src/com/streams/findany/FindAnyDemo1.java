package com.streams.findany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyDemo1 {

	public static void main(String[] args) {

        List<Integer> list =Arrays.asList(7,8,9,10);
        //Returns the first element from the intermediate operation
        Optional<Integer> answer = list.stream().findAny(); 
        if(answer.isPresent()) {
        	System.out.println(answer.get());
        }else {
        	System.out.println("Empty value");
        }

	}

}

/*    OPTIONAL THEORY

 * A container object which may or may not contain a non-null value. If a value
 * is present, {@code isPresent()} will return {@code true} and {@code get()}
 * will return the value.
 */