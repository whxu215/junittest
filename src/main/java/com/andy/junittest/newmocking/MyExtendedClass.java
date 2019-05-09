package com.andy.junittest.newmocking;

public class MyExtendedClass extends MyClass {
	@Override
	public String getMessage(String message) {
		return "MyExtendedClass Hello " + message;
	}
	
	@Override
	public String getMessage() {
		return "MyExtendedClass Hello world!";
	}
}
