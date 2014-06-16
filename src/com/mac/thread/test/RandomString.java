package com.mac.thread.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {
	private Random random = new Random();
	
	public String getString(int length,String[]... chars){
		StringBuilder sb = new StringBuilder();
		List<String> l = new ArrayList<String>();
		for(String[] cs:chars){
			for(String s:cs){
				l.add(s);
			}
		}
		for(int i=0;i<length;i++){
			sb.append(l.get(random.nextInt(l.size())));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		RandomString rstr = new RandomString();
		System.out.println(rstr.getString(10, charsNum, charsLower, charsUpper,charsSymbol));
	}

	private final static String[] charsNum = {"0","1","2","3","4","5","6","7","8","9"};
	private final static String[] charsLower = {"a","b","c","d","e","f","g","h","i","j",
		"k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	private final static String[] charsUpper = {"A","B","C","D","E","F","G","H","I","J",
		"K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private final static String[] charsSymbol = {"@","~","!","#","$","%","^","&","*",
		"(",")","{","}","[","]","|",":",";","<",">",",",".","?","`"};
}
