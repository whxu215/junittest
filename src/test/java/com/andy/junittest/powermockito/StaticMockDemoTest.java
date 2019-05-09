package com.andy.junittest.powermockito;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.andy.junittest.staticmocking.IdGenerator;
import com.andy.junittest.staticmocking.StaticMockDemo;

@RunWith(PowerMockRunner.class)
@PrepareForTest({IdGenerator.class})
public class StaticMockDemoTest {
	
	@Test
	public void generateTest() {
		PowerMockito.mockStatic(IdGenerator.class);
		PowerMockito.when(IdGenerator.generate("aaa")).thenReturn("aaa123456");
		PowerMockito.when(IdGenerator.generate("bbb")).thenReturn("bbb123456");
		PowerMockito.when(IdGenerator.generate("ccc")).thenReturn("ccc123456");
		
		StaticMockDemo demo = new StaticMockDemo();
		String id1 = demo.generateId("aaa");
		String id2 = demo.generateId("bbb");
		String id3 = demo.generateId("ccc");
		
		Assert.assertThat(id1, is("aaa123456"));
		Assert.assertThat(id2, is("bbb123456"));
		Assert.assertThat(id3, is("ccc123456"));
	}
}
