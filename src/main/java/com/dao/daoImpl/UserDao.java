package com.dao.daoImpl;

import model.OepUser;

public interface UserDao {
	public void createUser(OepUser user);
	
	public void insert();
	
	public void retrieve();
	
	public void update(long userId, String userType);
	
	public void delete(long userId);
	
	//int login(String username, String password);
	
	
}


/*package uu;long 

import java.util.List;

public interface UserDAO {
public void createUserMine(UserMine UserMine);
public UserMine findUserMine(long pk);
public void update(UserMine UserMine, long pk);
public List<UserMine> getUserMines();
public void removeUserMine(long pk);
public void removeUserMine(UserMine UserMine);
}
*/