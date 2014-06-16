package com.mac.roman;

public class RomanNumbers {

	private static final char[] units = " MDCLXVI".toCharArray();
	
	public String toRoman(int n){
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()){
			int p = Integer.parseInt(String.valueOf(c));
			sb.append(p/5).append(p%5);
		}
		fillZero(sb, 8 - sb.length());
		StringBuilder news = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			news.append(convert(sb.charAt(i), i));
		}
		return news.toString().replaceAll("DCCCC", "CM").replaceAll("CCCC", "CD")
				.replaceAll("LXXXX", "XC").replaceAll("XXXX", "XL")
				.replaceAll("VIIII", "IX").replaceAll("IIII", "IV");
	}
	
	private void fillZero(StringBuilder sb, int l){
		for (int i = 0; i < l; i++) {
			sb.insert(0, "0");
		}
	}
	
	private String convert(char c, int i){
		int n = Integer.parseInt(String.valueOf(c));
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++) {
			sb.append(units[i]);
		}
		return sb.toString();
	}
	
}
