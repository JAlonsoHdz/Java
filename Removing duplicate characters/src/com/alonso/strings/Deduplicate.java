package com.alonso.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Deduplicate {
		
	private String string;

	public String getS() {
		return string;
	}
	public void setS(String s) {
		this.string = s;
	}
	
	public Deduplicate() {
	}
	
	
	
	public Deduplicate(String string) {
		/*super();*/
		this.string = string;
	}
	public void deduplicateNow() { 
	char[] chars = string.toCharArray();
	Set<Character> charSet = new LinkedHashSet<Character>();
	for (char c : chars) {
	    charSet.add(c);
	}

	StringBuilder sb = new StringBuilder();
	for (Character character : charSet) {
	    sb.append(character);
	}
	System.out.println(sb.toString());
	}
}
