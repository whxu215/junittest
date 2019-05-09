package com.andy.junittest.powermockito;

import com.andy.junittest.finalmocking.StateFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


import com.andy.junittest.finalmocking.StateHolder;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests of the {@link StateFormatter} class.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StateHolder.class)
public class StateFormatterTest {

	@Test
	public void testGetFormattedState_actualStateExists() throws Exception {
		
		final String expectedState = "state";
		
		StateHolder stateHolderMock = PowerMockito.mock(StateHolder.class);
		StateFormatter tested = new StateFormatter(stateHolderMock);
		
		Mockito.when(stateHolderMock.getState()).thenReturn(expectedState);

		final String actualState = tested.getFormattedState();
		
		assertEquals(expectedState, actualState);
		
	}

}