package com.java10features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {

	public static void main(String[] args) {
		var x = 10;

//		Map<String, List<String>> map = new HashMap<String, List<String>>();
		var map = new HashMap<String, List<String>>();

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			var key = entry.getKey();
			var val = entry.getValue();
		}

//		var s = null;

		Consumer<Integer> value = y -> System.out.println(x);
	}

}
