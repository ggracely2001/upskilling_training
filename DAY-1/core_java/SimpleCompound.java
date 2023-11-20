package com.cg.core_java;

import java.util.Scanner;

public class SimpleCompound {

	public static void main(String[] args) {
		double p,r,si,ci;
		int t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p:");
		p=sc.nextDouble();
		System.out.println("Enter t:");
		t=sc.nextInt();
		System.out.println("Enter r:");
		r=sc.nextDouble();
		
		si=(p*t*r)/100;
		System.out.println("Simple Interest: "+si);

		ci=(p*(Math.pow((1+(r/100)),t)))-p;
		System.out.println("Compound Interest: "+ci);
	}

}
