package com.andy.junittest;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class MathExtendUtilsTest {
	
	@Test
	public void testAdd() {
		BigDecimal result = MathExtendUtils.add("1.12", "3.99");
		Assert.assertEquals(result.doubleValue(), 5.11, 0);
		Assert.assertThat("object must be equal", result.doubleValue(), equalTo(5.11));
	}
	
	@Test
	public void testDevide() {
		BigDecimal result = MathExtendUtils.divide("10.05", "5");
		Assert.assertThat("object must be equal", result.doubleValue(), equalTo(2.01));
		Assert.assertThat("object must be equal", result.doubleValue(), is(2.01));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDevideExceptException() {
		MathExtendUtils.divide("10.05", "0");
	}
}