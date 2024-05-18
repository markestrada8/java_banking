package banking;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/**
 * Represents a bank for managing customers and their accounts
 */
public class Bank {

	public static void main(String[] args) {
		// instantiates bank object
		Bank bank = new Bank();
				
		bank.run();

	}
	
	/**
	 * Runs program by initializing and managing accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the bank! What is your name? ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("Hello " + name + "! We are creating a checking and savings account for you.");
		
		Customer customer = new Customer(name);
		
		System.out.println("What is your address? ");
		
		String address = scanner.next();
		
		customer.setAddress(address);
		
		BankAccount checkingAccount = new BankAccount("checking", customer);
		BankAccount savingsAccount = new BankAccount("Savings", customer);
		
		System.out.println();
		System.out.println("Customer Info: " + checkingAccount.getCustomerInfo());
		System.out.println();
		System.out.println("Checking Account Info: " + checkingAccount.getAccountInfo());
		System.out.println("Savings Account Info: " + savingsAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Enter amount (decimal) to deposit in your checking account: ");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		System.out.println("Checking Account Info: " + checkingAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Enter amount (decimal) to deposit in your savings account: ");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);
		System.out.println("Savings Account Info: " + savingsAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Enter amount (decimal) to withdraw from your checking account: ");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);	
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Checking Account Info: " + checkingAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Enter amount (decimal) to withdraw from your savings account: ");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);	
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Savings Account Info: " + savingsAccount.getAccountInfo());
		scanner.close();
	}
	

}
