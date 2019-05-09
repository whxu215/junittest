package com.andy.junittest.simpleobjectmocking;

public class StateFormatter {

	private final NonFinalStateHolder stateHolder;

	public StateFormatter(NonFinalStateHolder stateHolder) {
		this.stateHolder = stateHolder;
	}

	public String getFormattedState() {
		String safeState = "State information is missing";
		final String actualState = stateHolder.getState();
		if (actualState != null) {
			safeState = actualState;
		}
		return safeState;
	}
}