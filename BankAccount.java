package banking;

/**
 * Represents a checking/ savings bank account for a customer 
 */

public class BankAccount {

	/**
	 * Type of account (checking/saving)
	 */
	String accountType;
	
	/**
	 * balance for bank account
	 */
	double balance;
	
	
	/**
	 * Customer for this Account
	 */
	Customer customer;
	
	 
	
	public BankAccount(String accountType,Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	
	
	/**
	 * Deposit the given amount
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	
	/**
	 * withdraw the given amount from balance
	 * @param amount
	 * @throws Exception (Coming back later for this part)
	 */
	public void withdraw(double amount)  throws Exception {
		if(amount > this.balance) {
			throw new Exception("Amount is greater than available Balance ");
		}
		this.balance -= amount;
	}
	
	
	/**
	 * Returns Account type and balance for this  bank Account
	 * @return
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	
	public String getCustomerInfo() {
		return this.customer.getName() +": "+ this.customer.getAddresee();
		
	}
	
	
}
