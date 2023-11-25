package com.java9.trywithresource;

public class MyWorker implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("CLosing the resource");
	}

	public MyWorker() {
		System.out.println("Creating the resource");
	}

	public void doSomething() {
		System.out.println("Doing something!");
	}

}
