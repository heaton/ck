package com.mac.temp;

import static org.junit.Assert.assertEquals;

import java.util.Dictionary;
import java.util.Hashtable;

import org.junit.Test;

public class testReplace {

	@Test
	public void test() {
		
		Dictionary<String,String> hashTable = new Hashtable<String,String>();
		hashTable.put("temp", "java");
		hashTable.put("name", "wangsi");
		hashTable.put("LOL", "英雄联盟");
		String str = "$temp$ here comes the name $name$ wo ca $LOL$";
		
		assertEquals("java here comes the name wangsi wo ca 英雄联盟",ReplaceStr.getReplace(str,hashTable));
	}
	
	@Test
	public void testTwo() {
		
		Dictionary<String,String> hashTable = new Hashtable<String,String>();
		hashTable.put("", "");
		
		assertEquals("",ReplaceStr.getReplace("",hashTable));
	}
	
}
