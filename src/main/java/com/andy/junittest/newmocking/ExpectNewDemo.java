package com.andy.junittest.newmocking;

public class ExpectNewDemo {

	public String getMessage() {
		MyClass myClass = new MyClass();
		return myClass.getMessage();
	}

	public String getMessageWithArgument() {
		MyClass myClass = new MyClass();
		return myClass.getMessage("test");
	}
}
