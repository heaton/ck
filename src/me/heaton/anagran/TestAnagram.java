package me.heaton.anagran;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestAnagram {

	@Test
	public void empty_string_return_empty_list() {
		Anagram anagram = new Anagram("a","b");
		List<String> actual = anagram.fetch("");
		assertEquals(expected(), actual);
	}

	@Test
	public void one_word_return_double_word(){
		assertAnagram(expected("a a"), "aa", "a");
		assertAnagram(expected("b b"), "bb", "b");
		assertAnagram(expected("ab ab"), "abab", "ab");
	}
	@Test
	public void more_word_return_words(){
		assertAnagram(expected("b b"), "bb", "a","b");
	}
	@Test
	public void more_word_return_words2(){
		assertAnagram(expected("abc abc"), "bacbac", "abc");
	}

	@Test
	public void ab_return_a_b(){
		assertAnagram(expected("a b"), "ab", "a","b");
	}

	private void assertAnagram(List<String> expected, String word, String... words) {
		Anagram anagram = new Anagram(words);
		List<String> actual = anagram.fetch(word);
		assertEquals(expected, actual);
	}

	private List<String> expected(String... param){
		return Arrays.asList(param);
	}
}
