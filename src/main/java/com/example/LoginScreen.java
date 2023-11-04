package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple class for user authentication, simulating a user database.
 */
public class LoginScreen {

	/**
	 * Simulated user database (username, password)
	 */
	private Map<String, String> userDatabase;

	/**
	 * Constructs a new LoginScreen instance and initializes the user database.
	 * For example purposes, it preloads the database with some sample users.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}

	/**
	 * Attempts to authenticate user based on their username and password
	 * 
	 * @param username The username of the user attempting to log in.
	 * @param password The password entered by the user.
	 * @return {@code true} if authentication is successful, {@code false} otherwise
	 */
	public boolean login(String username, String password) {
		// Verify if the entered username exists in database
		if(!userDatabase.containsKey(username)) {
			return false; // Authentication failed
		}

		// Verify if the entered password matches with the password in the database
		String storedPassword = userDatabase.get(username);
		if(!storedPassword.equals(password)) {
			return false; // Authentication failed
		}

		return true; // Authentication successful
	}

	/**
	 * Adds a new user to the user database. Please note that this method is not
	 * recommended for use in a production environment as it lacks proper security
	 * measures.
	 * 
	 * @param username The username of the new user.
	 * @param password The password of the new user.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}