package com.java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> list = List.of(15, 20, 27, 30);
		
		List<Integer> unmodifiableList = list.stream().filter(i -> (i % 3)==0).collect(Collectors.toUnmodifiableList());
		unmodifiableList.add(10);
	}

}
