package com.string.basics;

public class StringHashcodeExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "TamilNadu";
		String s2 = s1;
		String s3 = s1;
		System.out.println("s1 value: "+s1);
		System.out.println("s1 Hashcode: "+s1.hashCode());
		System.out.println("s2 value: "+s2);
		System.out.println("s2 Hashcode: "+s2.hashCode());
		System.out.println("s3 value: "+s3);
		System.out.println("s3 Hashcode: "+s3.hashCode());
		
		s1 = "AndhraPradesh";
		s2=s1;
		s3=s1;
		System.out.println(">>>>>>>>>>>>After");
		System.out.println("s1 value: "+s1);
		System.out.println("s1 Hashcode: "+s1.hashCode());
		System.out.println("s2 value: "+s2);
		System.out.println("s2 Hashcode: "+s2.hashCode());
		System.out.println("s3 value: "+s3);
		System.out.println("s3 Hashcode: "+s3.hashCode());
		
	}

}
