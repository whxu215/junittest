package com.andy.junittest.powermockito;

import com.andy.junittest.newmocking.ExpectNewDemo;
import com.andy.junittest.newmocking.MyClass;
import com.andy.junittest.newmocking.MyExtendedClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ MyClass.class, ExpectNewDemo.class })
public class ExpectNewDemoTest {

	@Test
	public void testGetMessageWithExtendedClass() throws Exception {
		ExpectNewDemo tested = new ExpectNewDemo();
		
		PowerMockito.whenNew(MyClass.class).withNoArguments().thenReturn(new MyExtendedClass());

		String expected = "MyExtendedClass Hello world!";
		
		Assert.assertEquals("Expected and actual did not match", expected, tested.getMessage());
	}
	
	@Test
	public void testGetMessage() throws Exception {
		ExpectNewDemo tested = new ExpectNewDemo();
		
		MyClass myClass = PowerMockito.mock(MyClass.class);
		PowerMockito.whenNew(MyClass.class).withNoArguments().thenReturn(myClass);

		String expected = "Mock Hello world!";
		PowerMockito.when(myClass.getMessage()).thenReturn(expected);
		
		Assert.assertEquals("Expected and actual did not match", expected, tested.getMessage());
	}

}
