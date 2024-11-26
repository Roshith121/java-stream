package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestAndHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(10,32,122,334,54,5,56,6,57,942);

		
		Integer secondHighest = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		Integer secondLowest = numbers.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("secondHighest : "+secondHighest);
		System.out.println("secondLowest : "+secondLowest);
	}

}
