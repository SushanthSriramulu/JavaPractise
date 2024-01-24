package com.string.basics;

public class StringHashcodeExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		System.out.println("s1 value: "+s1);
		System.out.println("s1 hashcode: "+s1.hashCode());
		
		String s2 = new String("pqr");
		s1=s2;
		System.out.println("s1 value: "+s1);
		System.out.println("s1 hashcode: "+s1.hashCode());
		System.out.println("s2 value: "+s2);
		System.out.println("s2 hashcode: "+s2.hashCode());
	}
}
