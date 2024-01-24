package com.java.basics;

public class MainMethod {
	
	public static void main(String[] args) {
		
		
		/*
		 1. Java Compiler wont check if Class contains main() method or not. 
		 2. At runtime JVM first Search for main() method
		 3. Without main() method JVM will not run Java Application
		 4. JVM is a software tool inside which instructions are written to search first with main() method
		  */
		
		/*
		 public - To call by JVM from anywhere
		 static - without existing object JVM has to call main() method and main() method is not way related
		 		  to any object
		 void - main() method wont return anything to JVM
		 main - name configured inside JVM
		 String[] args - command line arguments
		 
		 Modification to be Allowed in main() method:
		 
		 1. main() method syntax is very important, If we change anything in syntax JVM will not run Java
		 		Application
		 2. Order of modifiers is not important i.e instead of "public static" we can write "static public"
		 3. We can declare "String[]" in any acceptable form:
		  		main(String[] args)
		  		main(String []args)
		  		main(String args[])
		 4. Instead of "args" we can take any valid java identifier
		 5. We can replace main(String[] args) --> main(String... args)	with "var arg parameter"
		 6. We can declare main() method with following modifiers:
		 	final, synchronized, strictfp
		 7. class Test{
		 			final static synchronized strictfp public void main(String.. sushanth){
		 			System.out.println("Valid main method");
		 			}	
		 		}
		 	Even though this is valid and legal we wont use this type of main method
		 8. */
	}

}
