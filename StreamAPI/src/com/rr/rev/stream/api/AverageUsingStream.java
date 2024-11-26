package com.rr.rev.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = new ArrayList<>();
		numberList = Arrays.asList(1,2,36,4,35,52,61,7,8,83,3,3,45,51);
		Double avg = numberList.stream().mapToInt(e->e).average().getAsDouble();
		System.out.print("sum  : "+ avg);

	}

}
