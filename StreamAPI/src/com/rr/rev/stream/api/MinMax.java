package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = Arrays.asList(1,2,36,4,35,52,61,7,8,83,3,3,45,51);
		
		Integer max = numberList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer min = numberList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("MAX VALUE : "+max);
		System.out.println("MIN VALUE : "+min);

	}

}
