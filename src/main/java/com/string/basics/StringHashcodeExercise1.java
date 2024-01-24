package com.string.basics;

public class StringHashcodeExercise1 {
	
	public static void main(String[] args) {
		
		String s1 = "adc";
		String s2 = "pqr";
		String s3 = s1+s2;
		String s4 = new String(s1);//check
		String s5 = s1;
		if(s4==s1) {
			System.out.println("Hashcode is Same");
		}else {
			System.out.println("Not Same");
		}
		String s6 = new String();
		System.out.println("Value of s1: "+s1);
		System.out.println("Hashcode for s1 Object: "+s1.hashCode());
		System.out.println("Value of s2: "+s2);
		System.out.println("Hashcode for s2 Object: "+s2.hashCode());
		System.out.println("Value of s3: "+s3);
		System.out.println("Hashcode for s3 Object: "+s3.hashCode());
		System.out.println("Value of s4: "+s4);
		System.out.println("Hashcode for s4 Object: "+s4.hashCode());
		System.out.println("Value of s5: "+s5);
		System.out.println("Hashcode for s5 Object: "+s5.hashCode());
		System.out.println("Value of s6: "+s6);
		System.out.println("Hashcode for s6 Object: "+s6.hashCode());
		String s7 = new String();
		System.out.println("New String Hashcode for s7 Object: "+s7.hashCode());
		s7 = s1;
		System.out.println("S1 Value Hashcode for s7 Object: "+s7.hashCode());
		
	}

}
