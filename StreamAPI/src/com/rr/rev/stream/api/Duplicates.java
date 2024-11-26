package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = Arrays.asList(1,2,36,4,3,4,2,52,61,7,8,83,3,3,45,51);
		Set<Integer> duplicateList = numberList.stream().filter(e->Collections.frequency(numberList, e)>1).collect(Collectors.toSet());
		System.out.print("duplicateList  : "+ duplicateList);
	}

}
