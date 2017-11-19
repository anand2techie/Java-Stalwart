package com.Exceptions;

public class AccountIdNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Specified Account ID is not present";
	}
}
