package service;

import dao.RegistrationDao;
import dao.RegistrationDaoCollectionImpl;
import model.RegistrationPojo;

public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDao registrationDao;

	public RegistrationServiceImpl() {

		registrationDao = new RegistrationDaoCollectionImpl();

	}

	@Override
	public RegistrationPojo addUser(RegistrationPojo registrationPojo) {

		return registrationDao.addUser(registrationPojo);

	}

	@Override
	public RegistrationPojo loginUser(String userName, String password) {

		return registrationDao.loginUser(userName, password);

	}

}
