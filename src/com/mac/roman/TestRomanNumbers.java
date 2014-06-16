package com.mac.roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumbers {

	private RomanNumbers instance = new RomanNumbers();
	
	@Test
	public void testDecade() {
		assertEquals("I", instance.toRoman(1));
		assertEquals("IV", instance.toRoman(4));
		assertEquals("IX", instance.toRoman(9));
	}

	@Test
	public void testI() {
		assertEquals("I", instance.toRoman(1));
		assertEquals("II", instance.toRoman(2));
		assertEquals("III", instance.toRoman(3));
		assertEquals("IV", instance.toRoman(4));
	}

	@Test
	public void testV() {
		assertEquals("V", instance.toRoman(5));
		assertEquals("VI", instance.toRoman(6));
		assertEquals("VII", instance.toRoman(7));
		assertEquals("VIII", instance.toRoman(8));
		assertEquals("IX", instance.toRoman(9));
	}

	@Test
	public void testX() {
		assertEquals("X", instance.toRoman(10));
		assertEquals("XII", instance.toRoman(12));
		assertEquals("XV", instance.toRoman(15));
		assertEquals("XVI", instance.toRoman(16));
		assertEquals("XLIX", instance.toRoman(49));
	}

	@Test
	public void testL() {
		assertEquals("L", instance.toRoman(50));
		assertEquals("LI", instance.toRoman(51));
		assertEquals("LXV", instance.toRoman(65));
		assertEquals("LXVI", instance.toRoman(66));
	}

	@Test
	public void testC() {
		assertEquals("C", instance.toRoman(100));
		assertEquals("CLXVI", instance.toRoman(166));
		assertEquals("CCCLXV", instance.toRoman(365));
		assertEquals("CCCLXXXIX", instance.toRoman(389));
		assertEquals("CDLIX", instance.toRoman(459));
	}

	@Test
	public void testD() {
		assertEquals("D", instance.toRoman(500));
		assertEquals("DCLXVI", instance.toRoman(666));
	}

	@Test
	public void testM() {
		assertEquals("M", instance.toRoman(1000));
		assertEquals("MDCLXVI", instance.toRoman(1666));
		assertEquals("MMMDCLXVI", instance.toRoman(3666));
		assertEquals("MMMCCCLXXXIX", instance.toRoman(3389));
	}

	@Test
	public void testAcceptance() {
		assertEquals("CCCLXXXIX", instance.toRoman(389));
	}
	
}
