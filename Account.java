import java.io.File;

public class Account {

	private String accountNumber;
	private String customerName;
	private String deliveryFrequency;
	private double balance;

	// Constructor for testing
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	// Existing methods
	public File getStatements() {
		throw new UnsupportedOperationException();
	}

	public File getTaxDocuments() {
		throw new UnsupportedOperationException();
	}
}
