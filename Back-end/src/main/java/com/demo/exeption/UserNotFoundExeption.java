package com.demo.exeption;

public class UserNotFoundExeption extends RuntimeException {

	public UserNotFoundExeption(String message) {
	super(message);
	}

}
