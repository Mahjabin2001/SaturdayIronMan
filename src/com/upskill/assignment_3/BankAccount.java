
package com.upskill.assignment_3;

public class BankAccount {
       static String name;
	   static int amount;
	
	
	
	public BankAccount(String name, int amount) {
		this.name = name;
		this.amount = amount;
		
	}
	
	
	public void deposit(int balance) {
		amount += balance;
		System.out.println("New amount after deposit is " + amount);
	}
	
	
	
	public void withdraw(int balance) {
		amount -= balance;
		System.out.println("New amount after withdrawal is " + amount);
	}
	
	
	public static void display() {
		System.out.println("Account name: " + name);
		System.out.println("initial amount: " + amount);
	}

	class Savings extends BankAccount {

		public Savings(String name, int amount) {
			super(name, amount);
			
		}
		

	}

	
	class Checking extends BankAccount {

		public Checking(String name, int amount) {
			super(name, amount);
			
		}

	}
	public static void main(String[] args) {

		 BankAccount bankAccount = new BankAccount("Savings", 10000);
	        bankAccount.display();
	        bankAccount.deposit(5000);
	       

	        BankAccount bankAccount1 = new BankAccount("Checking", 20000);
	        bankAccount1.display();
	        bankAccount1.deposit(6000);
	        bankAccount1.withdraw(3000);
	        
	}
	
	
	
}
