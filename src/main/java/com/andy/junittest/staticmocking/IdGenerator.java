package com.andy.junittest.staticmocking;

import java.util.UUID;

public class IdGenerator {
	public static String generate(String prefix) {
		return prefix + UUID.randomUUID();
	}
}
