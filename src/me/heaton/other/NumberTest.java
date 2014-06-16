package me.heaton.other;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class NumberTest {

	@Test
	public void oneReturnEmpty() {
		List<Integer> re = result(1);
		assertTrue(re.isEmpty());
	}

	@Test
	public void twoReturnTwo() {
		List<Integer> re = result(2);
		assertEquals(1, re.size());
		assertEquals(2, re.get(0).intValue());
	}

	@Test
	public void fourReturnTwoTwo() {
		List<Integer> result = result(4);
		assertEquals(2, result.size());
		assertEquals(2, result.get(0).intValue());
		assertEquals(2, result.get(1).intValue());
	}

	@Test
	public void testOther() {
		List<Integer> re = result(2*3*3*5);
		assertEquals(4, re.size());
		assertEquals(2, re.get(0).intValue());
		assertEquals(3, re.get(1).intValue());
		assertEquals(3, re.get(2).intValue());
		assertEquals(5, re.get(3).intValue());
	}

	private List<Integer> result(int i){
		Number instance = new Number(i);
		return instance.factors();
	}

}
