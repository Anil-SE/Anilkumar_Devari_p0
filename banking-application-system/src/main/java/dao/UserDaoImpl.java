package dao;

import java.sql.Statement;

import exception.SystemException;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.ResultSet;

import model.UserPojo;

public class UserDaoImpl implements UserDao{
	
	public UserPojo addUser(UserPojo userPojo)throws SystemException {
		
		Connection conn;
		
		try {
			
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO user_details(user_name, email_id, password, phone_no) VALUES ('"+userPojo.getUserName()+"', '"+userPojo.getEmailId()+"', '"+userPojo.getPassword()+"', "+userPojo.getPhoneNo()+")";
			int rowsAffected = stmt.executeUpdate(query);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return userPojo;
		
		
		
	}

	public UserPojo loginUser(String userName, String password)throws SystemException {
		Connection conn = null;
		UserPojo userPojo = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT user_name FROM user_details WHERE password="+password;
			ResultSet resultSet = stmt.executeQuery(query);
			if(resultSet.next()) {
				 userPojo = new UserPojo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return userPojo;
	}
	
	

}
