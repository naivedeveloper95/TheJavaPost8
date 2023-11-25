package com.java9.safevaragrs;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "xyz");
		List<String> list2 = Arrays.asList("nyc", "lon");

//		SafeVarargs.myMethod(list, list2);
		SafeVarargsDemo sva = new SafeVarargsDemo();
		sva.myMethod(list, list2);
	}

	public void myMethod(List<String>... lists) {
//		Object[] arr = lists;
//		arr[0] = Arrays.asList(1, 2);

		String name = lists[0].get(0);
		System.out.println(name);

	}

}
