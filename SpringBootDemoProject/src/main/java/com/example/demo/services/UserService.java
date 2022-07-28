package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.beans.User;

@Component
public class UserService {

	static HashMap<Integer, User> userIdMap;

	public UserService() {

		userIdMap = new HashMap<Integer, User>();

		User user1 = new User(1, "Marc", 22, 200, "snooker", "charles dickens");
		User user2 = new User(2, "john", 19, 190, "football", "dickens");
		User user3 = new User(3, "anna", 24, 150, "swimming", "charles");

		userIdMap.put(1, user1);
		userIdMap.put(2, user2);
		userIdMap.put(3, user3);

	}

	public List getAllUsers() {

		List users = new ArrayList<>(userIdMap.values());

		return users;

	}

	public User getUserByID(int id) {

		User user = userIdMap.get(id);
		return user;
	}

	public User getUserByName(String name) {

		User user = null;

		for (int i : userIdMap.keySet()) {
			if (userIdMap.get(i).getName().equals(name)) {
				user = userIdMap.get(i);
			}
		}

		return user;
	}

}
