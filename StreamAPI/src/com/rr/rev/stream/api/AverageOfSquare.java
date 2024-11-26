package com.rr.rev.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = new ArrayList<>();
		numberList = Arrays.asList(1,2,36,4,35,52,61,7,8,83,3,3,45,51);
		Double avgSquare = numberList.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.print("sum  : "+ avgSquare);

	}

}
