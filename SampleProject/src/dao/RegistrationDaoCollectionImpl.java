package dao;

import java.util.ArrayList;
import java.util.List;


import model.RegistrationPojo;

public class RegistrationDaoCollectionImpl implements RegistrationDao {
	
	List<RegistrationPojo> allUsers = new ArrayList<RegistrationPojo>();

	public RegistrationDaoCollectionImpl() {

		RegistrationPojo registration1 = new RegistrationPojo("anil", "anil6@gmail.com", "password1", 456789191);
		RegistrationPojo registration2 = new RegistrationPojo("kumar", "kumar6@gmail.com", "password2", 456789192);
		RegistrationPojo registration3 = new RegistrationPojo("devari", "devari6@gmail.com", "password3", 456789193);
		allUsers.add(registration1);
		allUsers.add(registration2);
		allUsers.add(registration3);

	}

	@Override
	public RegistrationPojo addUser(RegistrationPojo registrationPojo) {
		
		int indexNode = allUsers.size();
		allUsers.add(indexNode, registrationPojo);
		return registrationPojo;
		
	}

	@Override
	public RegistrationPojo loginUser(String userName, String password) {
		RegistrationPojo foundUser = null;
		for(int i=0; i<allUsers.size(); i++) {
			
			if ((allUsers.get(i).getuserName() == userName) && (allUsers.get(i).getPassword() == password)) {
				foundUser = allUsers.get(i); //when match found in registered users, assigned foundUser variable to exisiting user
				break;
			}
		}
		return foundUser;
	}
	
	

}
