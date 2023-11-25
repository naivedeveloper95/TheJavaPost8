package com.java9.trywithresource;

public class Test {

	public static void main(String[] args) {

		MyWorker worker = new MyWorker();

		try (worker) {
			worker.doSomething();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
