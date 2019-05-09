package com.andy.junittest.powermockito;

import com.andy.junittest.privatemocking.PrivateMethodDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


import static org.junit.Assert.assertEquals;
//import static org.powermock.api.easymock.PowerMock.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PrivateMethodDemo.class)
public class PrivateMethodDemoTest {

	@Test
	public void testMockPrivateMethod() throws Exception {
		PrivateMethodDemo tested = new PrivateMethodDemo();
		
		String expected = "Hello altered World";
		tested = PowerMockito.spy(tested);
		PowerMockito.when(tested, "sayIt", "name").thenReturn(expected);

		String actual = tested.say("name");
		
		assertEquals("Expected and actual did not match", expected, actual);
	}
}