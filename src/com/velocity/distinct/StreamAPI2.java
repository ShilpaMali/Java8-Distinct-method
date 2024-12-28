package com.velocity.distinct;

import java.util.ArrayList;
import java.util.List;

//Program for removing elements with java 8

public class StreamAPI2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(30);
		list.add(50);

		// System.out.println(list.stream().distinct());

		list.stream().distinct().forEach(p -> System.out.println(p));

	}

}
