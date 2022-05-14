package model;

public class RegistrationPojo {

	private String userName;
	private String emailId;
	private String password;
	private long phoneNo;

	public RegistrationPojo() {
		super();

	}

	public RegistrationPojo(String userName, String emailId, String password, long phoneNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
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
		return "RegistrationPojo [userName=" + userName + ", emailId=" + emailId
				+ ", password=" + password + ", phoneNo=" + phoneNo + "]";
	}

}
