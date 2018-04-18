package test;

public class Account {

	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Account(String firstName,String lastName,String accountNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.accountNumber=accountNumber;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}