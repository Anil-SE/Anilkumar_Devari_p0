package service;

import model.RegistrationPojo;

public interface RegistrationService {
	
	RegistrationPojo addUser(RegistrationPojo registrationPojo);
	RegistrationPojo loginUser(String userName, String password);


}
