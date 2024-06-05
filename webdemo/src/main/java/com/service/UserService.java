package com.service;

import com.model.User;

public interface UserService {
	void adduser(User u);
	boolean login(String un,String pw);
}
