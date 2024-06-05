package com.service;

import java.sql.Statement;

import com.db.Database;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void adduser(User u) {
	String sql="insert into user(fname,lname,username,password)values('"+u.getFname()+"','"+u.getLname()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
	try{
	Statement state=Database.getDbCon().createStatement();
	state.execute(sql);
	}catch(Exception e){
		
	}
	}

	@Override
	public boolean login(String un, String pw) {
		// TODO Auto-generated method stub
		return false;
	}

}
