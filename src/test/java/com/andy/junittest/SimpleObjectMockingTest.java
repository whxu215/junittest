package com.andy.junittest;

import static org.junit.Assert.assertEquals;

import com.andy.junittest.simpleobjectmocking.NonFinalStateHolder;
import com.andy.junittest.simpleobjectmocking.StateFormatter;
import org.junit.Test;
import org.mockito.Mockito;

public class SimpleObjectMockingTest {
	@Test
	public void testGetFormattedState_actualStateExists() throws Exception {
		
		final String expectedState = "state";
		
		NonFinalStateHolder stateHolderMock = Mockito.mock(NonFinalStateHolder.class);
		StateFormatter tested = new StateFormatter(stateHolderMock);
		
		Mockito.when(stateHolderMock.getState()).thenReturn(expectedState);
//		Mockito.when(stateHolderMock.getState()).thenCallRealMethod();
		/*
		Mockito.when(stateHolderMock.getState()).then(new Answer<String>() {
			public String answer(InvocationOnMock invocation) throws Throwable {
				Method method = invocation.getMethod();
				if (method.getName().equals("getState")) {
					return expectedState;
				}
				return "123456";
			}
		});
		*/

		

		final String actualState = tested.getFormattedState();
		
		assertEquals(expectedState, actualState);
//		assertEquals("123456", actualState);
		
	}
	
}
