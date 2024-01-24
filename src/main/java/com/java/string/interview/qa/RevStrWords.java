package com.java.string.interview.qa;

import java.util.regex.Pattern;

public class RevStrWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Know Java Programmin";
		Pattern pattern = Pattern.compile("\\s");
		String[] pSplit = pattern.split(str);  //0- I , 1-Know , 2-Java , 3-Programming
		String result = "";
		
		for (int i = 0; i < pSplit.length; i++) {
			if(i==pSplit.length-1) {
				result=pSplit[i]+result;
			}else {
				result = " "+pSplit[i]+result;
			}
		}
		System.out.println(result);
	}
}
