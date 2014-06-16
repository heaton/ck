package com.mac.temp;

import java.util.Dictionary;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceStr {
	
	public static String getReplace(String str , Dictionary<String,String> hashTable){
		
		String newStr = "";
		
		if ("".endsWith(str)) 
			return "";
		
		//正则表达式 匹配指定符号内的字符
		Pattern pattern = Pattern.compile("\\$([A-Za-z])*\\$");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			
			String srcStr = matcher.group(); //这里得到的 name
			String key = srcStr.replace("$", "");
			
			String value  = hashTable.get(key);	//字典中的值
			if ("".equals(value) || null == value) {
				continue;
			}
			//替换 String 字符串中的值
			if ("".equals(newStr)) {
				newStr = str.replace(srcStr, value);
			}else {
				newStr = newStr.replace(srcStr, value);
			}
		}
		
		return newStr;
	}

}
