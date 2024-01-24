package com.java.string.interview.qa;

public class FirstLetterIntoCaps {
	
	public static void main(String[] args) {
		
		String str = "java selenium junit testng cucumber sql";
		String[] splittedValue = str.split("\\s");
		String finalValue = "";
		for (String desString : splittedValue) {
			String firstLetter	= desString.substring(0, 1);
			String remainingLetter = desString.substring(1);
			//finalValue = finalValue+firstLetter.toUpperCase()+remainingLetter+" ";
			finalValue = " "+firstLetter.toUpperCase()+remainingLetter+finalValue;  //First Letter Caps and in reverse order
		}
		System.out.println(finalValue);
	}

}
