package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n ="2";
		List<Integer> numbers = Arrays.asList(2,3,42,4344,4224,32,52,54,25,45,6,772,7,5,527,26,25,24364,35433,22,3233,43,5,2543,234);
		List<Integer> numberStartingWith =numbers.stream().map(String::valueOf).filter(e->e.startsWith(n)).map(Integer::valueOf).collect(Collectors.toList());
		
		System.out.println("number starting with"+ n +" are : "+numberStartingWith);
	}

}
