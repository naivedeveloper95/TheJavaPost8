package com.java12.stringapi;

public class Java12Features {

	public static void main(String[] args) {
		String s = "  All the power is within you.";
		System.out.println("Before Indentation \n" + s);
		System.out.println("After Indentation \n" + s.indent(5));
		System.out.println("After Indentation \n" + s.indent(-3));

		String s1 = "10";
		System.out.println(s1.transform(Integer::parseInt));

	}

}
