package service;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import model.UserPojo;

public class UserServiceImpl implements UserService {

	UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserPojo addUser(UserPojo userPojo) throws SystemException {

		return userDao.addUser(userPojo);
	}

	public UserPojo loginUser(String username, String password) throws SystemException {

		return userDao.loginUser(username, password);
	}

}
