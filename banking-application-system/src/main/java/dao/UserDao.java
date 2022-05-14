package dao;

import exception.SystemException;
import model.UserPojo;

public interface UserDao {
	
	UserPojo addUser(UserPojo userpojo)throws SystemException;
	UserPojo loginUser(String username, String password)throws SystemException;

}
