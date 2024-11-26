package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = Arrays.asList(1,2,36,4,3,4,2,52,61,7,8,83,3,3,45,51);
		List<Integer> sortedList = numberList.stream().sorted().collect(Collectors.toList());
		// reverse order
		List<Integer> reverseSortedList = numberList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Sorted List : "+sortedList);
		System.out.println("Reverse sorted List : "+reverseSortedList);
		
		
	}

}
