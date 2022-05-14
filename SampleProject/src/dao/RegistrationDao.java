package dao;

import model.RegistrationPojo;

public interface RegistrationDao {
	
	RegistrationPojo addUser(RegistrationPojo registrationPojo);
	RegistrationPojo loginUser(String userName, String password);

}
