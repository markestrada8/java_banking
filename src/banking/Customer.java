package banking;

/**
 * Represents a customer of a bank 
 */
public class Customer {
	//Instance vars
	
	/**
	 * Customer name
	 */
	String name;
	
	/**
	 * Customer address
	 */
	String address;
	
	//constructor
	
	/**
	 * Creates a customer with the given name
	 * @param name
	 */
	public Customer(String name) {
		//Sets instance var name to given name
		this.name = name;
	}
	
	//methods
	/**
	 * Sets the address of customer to the given address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Get customer name
	 * @return name
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Get customer address
	 * @return address
	 */
	public String getAddress() {
		return this.address;
	}

}
