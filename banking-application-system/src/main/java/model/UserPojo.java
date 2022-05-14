package model;

//private variables
//default constructore
//parametrized constructor
//public getters/setters
//toString
//equals - if required
//hashCode - if required

public class UserPojo {
	
	private String userName;
	private String emailId;
	private String password;
	private long phoneNo;
	
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPojo(String userName, String emailId, String password, long phoneNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "UserPojo [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
	

}
