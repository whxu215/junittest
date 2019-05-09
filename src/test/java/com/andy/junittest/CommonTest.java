package com.andy.junittest;

//import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class CommonTest {
	@Test
	public void testBoth() {
		Assert.assertThat("", 1, greaterThan(0));
		Assert.assertThat("", "ab", both(containsString("a")).and(containsString("b")));
	}
	
	@Test
	public void testHasItem() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		Assert.assertTrue(list.contains("aaa"));
		Assert.assertThat(list, hasItem("aaa"));
		Assert.assertThat(list, hasItem(equalTo("aaa")));
		Assert.assertThat(list, hasItem(startsWith("cc")));
	}
	
	@Test
	public void testHasItems() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		Assert.assertThat(list, hasItems("aaa", "bbb"));
	}
	
	@Test
	public void testIsEqualto() {
		String str = "aa";
		Assert.assertEquals(str, "aa");
		Assert.assertThat(str, is("aa"));
		Assert.assertThat(str, equalTo("aa"));
		Assert.assertThat(str, is(equalTo("aa")));
	}
	
	@Test
	public void testNot() {
		String str = "aa";
		Assert.assertThat(str, not("bb"));
	}
	
	@Test
	public void testNullValue() {
		String str = null;
		Assert.assertThat(str, nullValue());
	}
	
	@Test
	public void testNotNullValue() {
		String str = "aa";
		Assert.assertThat(str, notNullValue());
	}
	
	@Test
	public void testEither() {
		Assert.assertThat("aa", either(is("aa")).or(is("bb")));
	}
	
	@Test
	public void testEveryItem() {
		List<String> list = new ArrayList<String>();
		list.add("aaa111");
		list.add("aaa222");
		list.add("aaa333");
		Assert.assertThat(list, everyItem(startsWith("aaa")));
	}
	
	@Test
	public void testIsA() {
		List<String> list = new ArrayList<String>();
		Assert.assertThat(list, isA(List.class));
	}
	
	@Test
	public void testAnything() {
		Assert.assertThat("aa", anything());
	}
	
	@Test
	public void testStr() {
		String str = "aaabbbccc";
		Assert.assertThat(str, startsWith("aaa"));
		Assert.assertThat(str, endsWith("ccc"));
		Assert.assertThat(str, containsString("bbb"));
	}
	
}
