package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private List<User> UserList;
	
	public List< User> getUserList(){
		if (UserList == null) {
			UserList = new ArrayList<>();
		}
		return UserList;
	}
}
