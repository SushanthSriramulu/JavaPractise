package com.java.string.interview.qa;

public class StrRepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Know Java Programming";
		int count=0;
		String lString = str.toLowerCase();// By changing it into lower or upper case we can we can compare all characters
		char[] chArr = lString.toCharArray();
		String dupChars="";
		for(int i=0; i<chArr.length;i++) {
			for(int j=i+1; j<chArr.length;j++) {
				if(chArr[i]==chArr[j] && chArr[i] != ' ' && chArr[j] !=' ') {
					//System.out.println("Duplicate Character from Given String: "+chArr[j]);
					dupChars=dupChars+chArr[j]+" ";
					count++;
				}
			}
		}	
		System.out.println("Duplicate Characters From Given String: "+dupChars);
		System.out.println("Number of Duplicate Characters From Given String: "+count);
	}
}
