package model;

public class GenerateUser {

	private String fName;
	private String lName;
	private String userName;
	
	public GenerateUser() {
		super();
	}
	
	public GenerateUser(String fName, String lName) {
		
		//will set first letter to upper, and everything after to lower, for both first and last name
		setfName(fName);
		setlName(lName);
		
		setUserName();
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		String firstName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
		
		this.fName = firstName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		String lastName = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();
		
		this.lName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName() {
		this.userName = fName.substring(0, 1) + lName.toLowerCase();
	}
	
	
}
