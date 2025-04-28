import java.util.Date;

public class Customer extends User {

	private String name;
	private Date dob;
	private String phoneNumber;
	private String email;
	private String password;
	private String ssn;
	private String address;

	// Constructor for testing
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	// Existing methods
	public boolean verifySSN() {
		throw new UnsupportedOperationException();
	}

	public boolean login(String email, String password) {
		throw new UnsupportedOperationException();
	}

	public void updateProfile() {
		throw new UnsupportedOperationException();
	}
}
