package com.andy.junittest.staticmocking;

public class StaticMockDemo {
	public String generateId(String prefix) {
		return IdGenerator.generate(prefix);
	}
}
