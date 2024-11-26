package com.rr.rev.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AdditionUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = new ArrayList<>();
		numberList = Arrays.asList(1,2,36,4,35,52,61,7,8,83,3,3,45,51);
		Optional<Integer>  sum = numberList.stream().reduce((a,b)-> a+b);
		System.out.print("sum  : "+ sum.get());
	}

}
