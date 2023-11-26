package com.java12.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {

	public static void main(String[] args) {

		Result result = Stream.of(5, 10, 20, 8, 7, 39, 15, 29).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()), Result::new));

		System.out.println(result);
	}

}
