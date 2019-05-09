package com.andy.junittest.powermockito;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

import com.andy.junittest.HttpURLUtil;
import com.andy.junittest.SmsManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpURLUtil.class})
public class SmsManagerTest {
	
	@Before
	public void setup() {
		PowerMockito.mockStatic(HttpURLUtil.class);
		PowerMockito.when(HttpURLUtil.doPost(anyString(), anyMap())).thenReturn("success");
	}
	@After
	public void teardown() {
		
	}
	
	@Test
	public void test() {
		String response = SmsManager.sendSms("18610342156", "test", "127.0.0.1", "test-sdk");
		Assert.assertThat(response, is("success"));
	}
}
