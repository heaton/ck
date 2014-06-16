package me.heaton.anagran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	private List<String> words;
	
	public Anagram(String... words) {
		this.words = Arrays.asList(words);
	}

	public List<String> fetch(String word) {
		List<String> result = new ArrayList<String>();
		int i = 0;
		for(String w1 : words){
			List<String> subWords = words.subList(i++, words.size());
			for(String w2 : subWords){
				if(isAnagram(word, w1 + w2)){
					result.add(w1 + " " + w2);
				}
			}
		}
		return result;
	}

	private boolean isAnagram(String word, String s) {
		return Arrays.equals(sortWord(word), sortWord(s));
	}

	private char[] sortWord(String word) {
		char[] ws = word.toCharArray();
		Arrays.sort(ws);
		return ws;
	}

}
