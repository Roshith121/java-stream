package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbersUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(10,32,2,3,4,5,6,6,7,9);
		List<Integer> limitNumbers = numbers.stream().sorted(Collections.reverseOrder()).limit(5).collect(Collectors.toList());
		System.out.println("Numbers : "+limitNumbers);

	}

}
