package com.rr.rev.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = new ArrayList<>();
		numberList = Arrays.asList(1,2,36,4,35,52,61,7,8,83,3,3,45,51);
		List<Integer> even = numberList.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> odd = numberList.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println("even List  : "+ even);
		System.out.println("odd List  : "+ odd);

	}

}
