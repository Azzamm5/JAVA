package banking;
/**
 * Represents a bank for managing customers and their bank account
 */

import java.util.*;


public class Bank {

	public static void main(String[] args) {
		
		// create a new instances of bank class
		Bank b = new Bank();
		
		
		// call the run method in the ban class
		b.run();
	}
	
	
	public void run() {
		System.out.println("Welcome The Bank, What is your name ?");
		
		Scanner scanner  = new Scanner(System.in);
		
		// Create Scanner to user input
		String name = scanner.next();
		
		
		System.out.println("Hello "+ name + " ! We are creating and saving accounts for you ");
		
		
		// create customer with given name 
		Customer customer = new Customer(name);	
		
		
		System.out.println("What is your Adresse?");
		String adresse = scanner.next();
		
		customer.setAddresse(adresse);
		
		// create a checking account for customer 
		BankAccount checkingAccount = new BankAccount("Checking",customer);
		
		//Create a saving Account for customer
		BankAccount SavingAccount = new BankAccount("Saving",customer);
		
		
		
		System.out.println();
		System.out.println("Customer Info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		System.out.println("Checking Info: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Saving Info: ");
		System.out.println(SavingAccount.getAccountInfo());
		
		
		System.out.println();
		System.out.println("Amount to deposit into your Checking Account?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		
		System.out.println();
		System.out.println("Amount to deposit into your Saving Account?");
		amount = scanner.nextDouble();
		SavingAccount.deposit(amount);
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(SavingAccount.getAccountInfo());
	}
}
