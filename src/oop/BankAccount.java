package oop;

public class BankAccount implements IRate{
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constants are often static final
	private static final String routingNumber = "0123456";
	
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor
		// 1. Used to define : setup : initialize properties of an object
		// 2. Constructors are implicitly called upon instantiation
		// 3. The same name as the class itself
		// 4. COnstructors have no return type
	BankAccount(){
		System.out.println("New account created.");
	}
	// Overloading: calling the same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, and msg are all local variables
		System.out.println("New account: " + accountType);
		System.out.println("Initial Deposit of: $" + initDeposit);
		String msg = null;
		if(initDeposit < 1000) {
			msg = "Error: Minimum deposit not met.";
		} else {
			msg = ("Thanks for your initial deposit of: $" + initDeposit);
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	// Interface Methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	// Getters and Setters
	
	// Allow the user to define the name
	//  @return the name
	public String getName() {
		return name;
	}
	
	// @param name the name to set
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	
	// @return the ssn
	public String getSsn() {
		return ssn;
	}
	
	// @param ssn the ssn to set
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Define methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private: which means it can only be called from the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your account balance is: $" + balance);
	}
	
	void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	
	void getStatus(){
		
	}
	
	@Override
	public String toString() {
		return "[ NAME:" + name + " ACCOUNT #: " + accountNumber + " ROUTING #:" + routingNumber + " balance: $" + balance + " ]"; 
	}
}
