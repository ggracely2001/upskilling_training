package com.cg.stringbuffer;

public class InsertOperation {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("It is used to at the specified index position");
		sb.insert(13, " "+"insert text");
		System.out.println(sb);
	}
}
