package com.cg.string;

public class StringOperations {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		String s1=str.toLowerCase();  //converts the original string into lower case
		System.out.println(s1);
		
		String s2=str.toUpperCase();  //converts the original string into upper case
		System.out.println(s2);
		
		String s3=str.replace("a", "$");  //replaces the character "a" in the original string with "$" symbol
		System.out.println(s3);
		
		if(str.contains("collection")){ //checks if the original string contains the word "collection"
			System.out.println("collection is in the string");
		}
		
		String s4="java string pool refers to collection of strings which are stored in heap memory";
		if(s4.equals(str)) {  //checks if s4 string and original string are equal
			System.out.println("Matches with original string");
		}
		else
			System.out.println("Doesn't match with original string");
		
		System.out.println(str.equalsIgnoreCase(s4)); //compares two strings ignoring the lower case and upper case differences
		
	}

}
