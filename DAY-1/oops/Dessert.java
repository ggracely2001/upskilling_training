package com.cg.oops;

import java.util.Scanner;

abstract class DessertItem{
	abstract public int getCost();
}
class Candy extends DessertItem{
	int TotalCandies=0;
	int DollarInRupee=1;
	public int addCandies(int candies) {
		this.TotalCandies+=candies;
		return TotalCandies;
	}
	public int getCost() {
		return TotalCandies*DollarInRupee;
	}
}
class Cookie extends DessertItem{
	int TotalCookies=0;
	int EuroInRupee=70;
	public int addCookies(int cookies) {
		TotalCookies+=cookies;
		return TotalCookies;
	}
	public int getCost() {
		return TotalCookies*EuroInRupee;
	}
}
class IceCream extends DessertItem{
	int  totalIceCream=0;
	public int addIceCream(int iceCream) {
		totalIceCream+=iceCream;
		return totalIceCream;
	}
	public int getCost() {
		return 0;
	}
}
public class Dessert {
	Scanner sc=new Scanner(System.in);
	private void selectRoles() {
		System.out.println("Enter your role customer or owner");
	    String role;
	    role=sc.next();
	    roles(role);
	}
	private void roles(String role) {
		if(role.toUpperCase().equals("CUSTOMER")) {
			placeOrder();
		}
		else if(role.toUpperCase().equals("OWNER")) {
			addItems();
		}
		else
			System.out.println("Please enter valid details!");
		}
		private void addItems() {
			System.out.println("Choose items to be added:");
			System.out.println("1.Candy\n2.Cookie\n3.IceCream");
			System.out.println("Enter your choice");
			int ch;
			ch=sc.nextInt();
			addItemsOperation(ch);
		}
		private void addItemsOperation(int choice) {
			switch(choice) {
			case 1:
				Candy candy=new Candy();
				System.out.println("Enter the amount of candies to be added");
				int amount;
				amount=sc.nextInt();
				int total=candy.addCandies(amount);
				System.out.println("Candies added successfully and total available are"+" "+total);
				break;
			case 2:
				Cookie cookie=new Cookie();
				System.out.println("Enter the amount of cookies to be added");
				
				amount=sc.nextInt();
				total=cookie.addCookies(amount);
				System.out.println("Cookies added successfully and total available are"+" "+total);
				break;
			case 3:
				IceCream iceCream=new IceCream();
				System.out.println("Enter the amount of ice cream to be added");
				amount=sc.nextInt();
				total=iceCream.addIceCream(amount);
				System.out.println("Ice Cream added successfully and total available are"+" "+total);
				break;
			default:
				System.out.println("Please enter a valid number!");
				break;
			}
		}
		private void placeOrder() {
			System.out.println("Choose items to be placed:");
			System.out.println("1.Candy\n2.Cookie\n3.IceCream");
			System.out.println("Enter your choice");
			int ch;
			ch=sc.nextInt();
			placeOrderOperation(ch);
		}
		private void placeOrderOperation(int choice) {
			switch (choice) {
			case 1:
				Candy candy=new Candy();
				System.out.println("Enter the amount of candies to be placed");
				
				int total=candy.getCost();
				System.out.println("Candies placed successfully and total cost is"+" "+total);
				break;
			case 2:
				Cookie cookie=new Cookie();
				System.out.println("Enter the amount of cookies to be placed");
				
				total=cookie.getCost();
				System.out.println("Cookies placed successfully and total cost is"+" "+total);
				break;
			case 3:
				IceCream iceCream=new IceCream();
				System.out.println("Enter the amount of Ice Cream to be placed");
				
				total=iceCream.getCost();
				System.out.println("Ice Cream placed successfully and total cost is"+" "+total);
				break;
			default:
				System.out.println("Please enter valid number");
				break;
			}
		}
		public static void main(String[] args) {
			Dessert dessert=new Dessert();
			dessert.selectRoles();
		}
}