package com.velocity.distinct;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Program for removing elements without java 8

public class StreamAPI1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(30);
		list.add(50);
		Set<Integer> s = new HashSet<Integer>(list);
		System.out.println(s);

	}

}
