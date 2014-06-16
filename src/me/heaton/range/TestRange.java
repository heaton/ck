package me.heaton.range;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestRange {

	@Test
	public void startWith1AndEndWith2() {
		List<Integer> expected = expectedList(1, 2);
		List<Integer> actual = range(true, 1, 2, true).allPoints();
		assertEquals(expected, actual);
	}

	@Test
	public void start1AndEndWith3(){
		List<Integer> expected = expectedList(2, 3);
		List<Integer> actual = range(false, 1, 3, true).allPoints();
		assertEquals(expected, actual);
	}

	@Test
	public void start1AndEnd4(){
		List<Integer> expected = expectedList(2, 3);
		List<Integer> actual = range(false, 1, 4, false).allPoints();
		assertEquals(expected, actual);
	}

	@Test
	public void One2FiveContains3(){
		Range r1 = range(true, 1, 5, true);
		Range r2 = range(true, 3, 4, true);
		assertTrue(r1.contains(r2));
	}

	@Test
	public void One2FiveNotContains6(){
		Range r1 = range(true, 1, 5, true);
		Range r2 = range(true, 6, 6, true);
		assertFalse(r1.contains(r2));
	}

	@Test
	public void One2FiveNotContains1357(){
		Range r1 = range(true, 1, 5, true);
		List<Integer> r2 = expectedList(1,3,5,7);
		assertFalse(r1.contains(r2));
	}

	private List<Integer> expectedList(Integer... es){
		return Arrays.asList(es);
	}

	private Range range(boolean startSelf, int start, int end, boolean endSelf){
		RangeStart s = new RangeStart(start, startSelf);
		RangeEnd e = new RangeEnd(end, endSelf);
		return new Range(s, e);
		
	}

}
