package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount("444565221", 1000);
		BankAccount acc2 = new BankAccount("555555521", 2000);
		BankAccount acc3 = new BankAccount("444444421", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest{
	// Properties of Bank Account
	private static int iD = 1000; // Internal id
	private String accountNumber; // ID + random 2 digit num + first 2 of ssn
	private static final String routingNumber = "004534523";
	private String name;
	private String SSN;
	private double balance;
	
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber(); // Calling setAccountNumber from the constructor
							// this way, every time a new acct is created
							// we get the random account number for each client
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your account number: " + accountNumber);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: $"+ amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: $" + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void accrueInterest() {
		
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);	
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]";
	}
	
}