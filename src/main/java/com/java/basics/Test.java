package com.java.basics;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os); //Linux , Mac , Windows ---> Linux - 0, Mac - 1 , Windows - 2
		System.out.println(Arrays.binarySearch(os, "Mac"));
		}
}
