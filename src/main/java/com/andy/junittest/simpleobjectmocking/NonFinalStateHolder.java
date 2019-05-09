package com.andy.junittest.simpleobjectmocking;

public class NonFinalStateHolder {
	/**
	 * Dummy method that is used to demonstrate how PowerMock can deal with
	 * final methods.
	 * 
	 * @return The current state.
	 */
	public String getState() {
		// Imagine that we query a database for state
		return "123456";
	}

	/**
	 * Dummy method that is used to demonstrate how PowerMock can deal with
	 * final methods.
	 */
	public void setState(String state) {
		// Imagine that we store the state in a database.
	}
}
