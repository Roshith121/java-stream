package com.rr.rev.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWith {

	public static void main(String[] args) {
		
		String n ="a";
		List<String> listOfNames = Arrays.asList("arjun","amit","ajeet","sumit","vijay","avinash");
		List<String> listOfNameStartWith = listOfNames.stream().filter(e-> e.startsWith(n)).collect(Collectors.toList());
		System.out.println("List of name starting with"+ n +" are : "+listOfNameStartWith);
	}
}
