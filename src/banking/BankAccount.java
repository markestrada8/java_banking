package banking;

/**
 * Represents a checking or savings bank account for a customer
 */

public class BankAccount {
	// Instance vars
	
	/**
	 * Account type
	 */
	String accountType;
	
	/**
	 * Balance for account
	 */
	double balance;
	
	/**
	 * Customer for this account
	 */
	Customer customer;
	
	//constructor
	/**
	 * Creates an account of given type for given customer
	 * @param accountType
	 * @param customer
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	/**
	 * Add given amount to balance
	 * @param amount
	 */
	//methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	 * Subtracts amount from balance, error if balance less than amount
	 * @param amount
	 * @throws Exception
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Error: Amount is greater than available balance");
		}
		this.balance -= amount;
	}
	
	/**
	 * Returns account type and balance
	 * @return data string
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * Returns customer name and address
	 * @return data string
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}

}
