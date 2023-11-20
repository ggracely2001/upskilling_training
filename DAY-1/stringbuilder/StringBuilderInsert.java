package com.cg.stringbuilder;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("It is used to at the specified index position");
		sb.insert(13, " "+"insert text");
		System.out.println(sb);
	}

}
